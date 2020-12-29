package javer.spring.test.controller;

import javer.spring.test.dto.Superhero;
import javer.spring.test.service.SuperheroRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/superhero")
public class SuperheroController {

    private final SuperheroRepository superheroRepository;

    public SuperheroController(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    @GetMapping
    public List<Superhero> findByUniverse(String universe) {
        return superheroRepository.findByUniverse(universe);
    }

    @GetMapping(path = "/{id}")
    public Superhero findById(@PathVariable("id") UUID id) {
        return superheroRepository.findById(id).orElseThrow();
    }

}
