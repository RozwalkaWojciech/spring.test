package javer.spring.test.util;

public class RequestCounter {

    private Long requestCount;

    public RequestCounter() {
        this.requestCount = 0L;
    }

    public Long getRequestCount() {
        return requestCount;
    }

    public void increaseCount() {
        this.requestCount++;
    }

}
