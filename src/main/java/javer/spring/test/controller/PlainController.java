package javer.spring.test.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlainController {

    @GetMapping(
            path = "/plain",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String plainName(@RequestParam(name = "name") String name) {
        return "Hello " + name;
    }

    @PostMapping(
            path = "/plain",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String plainLastName(@RequestParam(name = "lastName") String lastName) {
        return "Hello " + lastName;
    }

    @PostMapping(
            path = "/fullName",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String plainFullName(@RequestParam(name = "fullName") String fullName) {
        return "Hello " + fullName;
    }

    @PostMapping(
            path = "/fullName2",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String plainFullName2(@RequestParam(name = "name") String name,
                                 @RequestParam(name = "lastName") String lastName) {
        return "Hello " + name + " " + lastName;
    }
}
