package javer.spring.test.controller;

import javer.spring.test.component.Constants;
import javer.spring.test.dto.Superhero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemplateController {

    private final
    Constants constants;

    public TemplateController(Constants constants) {
        this.constants = constants;
    }

    @GetMapping(path = "/index")
    public String getIndex(Model model) {
        model.addAttribute("title", constants.getSiteName());
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

    @PostMapping(path = "/getSuperhero")
    public String getSuperhero(Model model, Superhero superhero) {
        model.addAttribute(superhero.getName());
        model.addAttribute(superhero.getNickName());
        model.addAttribute(superhero.getUniverse());
        return "getSuperhero";
    }

    @GetMapping(path = "/addSuperhero")
    public String addSuperhero() {
        return "addSuperhero";
    }
}
