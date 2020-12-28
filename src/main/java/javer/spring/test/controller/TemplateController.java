package javer.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {

    @GetMapping(path = "/index")
    public String getIndex(Model model) {
        model.addAttribute("title", "SIEMKA!");
        return "index";
    }
}
