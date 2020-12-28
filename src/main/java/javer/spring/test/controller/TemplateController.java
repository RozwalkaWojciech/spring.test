package javer.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemplateController {

    @GetMapping(path = "/index")
    public String getIndex(Model model) {
        model.addAttribute("title", "SIEMKA!");
        return "index";
    }

    @GetMapping(path = "/fullName")
    public String fullName(Model model,
                           @RequestParam(name = "name") String name,
                           @RequestParam(name = "lastName") String lastName) {
        model.addAttribute("name", name);
        model.addAttribute("lastName", lastName);
        return "fullName";
    }
}
