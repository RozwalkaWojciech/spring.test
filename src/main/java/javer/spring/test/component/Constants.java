package javer.spring.test.component;

import org.springframework.stereotype.Component;

@Component
public class Constants {

    private final String siteName = "Superhero site";

    public String getSiteName() {
        return siteName;
    }
}
