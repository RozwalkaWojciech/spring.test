package javer.spring.test.configuration;

import javer.spring.test.util.RequestCounter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public RequestCounter getRequestCounter() {
        return new RequestCounter();
    }
}
