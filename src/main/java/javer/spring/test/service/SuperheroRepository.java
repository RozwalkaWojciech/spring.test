package javer.spring.test.service;

import javer.spring.test.dto.Superhero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SuperheroRepository {

    private List<Superhero> superheroes = new ArrayList<>();

    public List<Superhero> getAllSuperheroes() {
        return superheroes;
    }

    public void saveSuperhero(Superhero superhero) {
        this.superheroes.add(superhero);
    }

    public Optional<Superhero> findById(Integer id) {
        return superheroes
                .stream()
                .filter(superhero -> superhero.getId() == id)
                .findFirst();
    }

    public List<Superhero> findByUniverse(String universe) {
        return superheroes
                .stream()
                .filter(superhero -> superhero.getUniverse().equals(universe))
                .collect(Collectors.toList());
    }

}
