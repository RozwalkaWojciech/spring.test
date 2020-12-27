package javer.spring.test.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

    @GetMapping(
            path = "/hello",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String helloSprong(
            @RequestParam(name = "name", required = true) String name
    ) {
        return "hello " + name;
    }

    @PostMapping(
            path = "/hello",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String postName(
            @RequestParam(name = "name", required = true) String name
    ) {
        return "hello from post " + name;
    }

}
