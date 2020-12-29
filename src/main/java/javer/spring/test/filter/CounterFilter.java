package javer.spring.test.filter;

import javer.spring.test.util.RequestCounter;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/plain/*")
@Order(1)
public class CounterFilter implements Filter {

    private final
    RequestCounter requestCounter;

    public CounterFilter(RequestCounter requestCounter) {
        this.requestCounter = requestCounter;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        requestCounter.increaseCount();
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletResponse.addHeader("X-counter", requestCounter.getRequestCount().toString());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
