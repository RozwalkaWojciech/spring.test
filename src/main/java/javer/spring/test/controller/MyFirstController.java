package javer.spring.test.controller;

import javer.spring.test.dto.Superhero;
import javer.spring.test.exception.NotFoundException;
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
    public String helloSpring(
            @RequestParam(name = "name") String name
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

    @PostMapping(
            path = "/superhero",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String getSuperhero(Superhero superhero) {
        if (superhero.getUniverse().equals("DC")) {
            throw new NotFoundException();
        }
        return superhero.toString();
    }
}
