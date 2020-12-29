package javer.spring.test.service;

import javer.spring.test.dto.Superhero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SuperheroRepository {

    private final List<Superhero> superheroes = new ArrayList<>();

    public List<Superhero> getAllSuperheroes() {
        return superheroes;
    }

    public void saveSuperhero(Superhero superhero) {
        this.superheroes.add(superhero);
    }

    public Optional<Superhero> findById(UUID id) {
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

    public Superhero editSuperhero(UUID id, Superhero superhero) {
        Superhero superheroToEdit = findById(id).orElseThrow();
        superheroToEdit.setName(superhero.getName());
        superheroToEdit.setNickName(superhero.getNickName());
        superheroToEdit.setUniverse(superhero.getUniverse());
        return superhero;
    }

    public void deleteSuperhero(UUID id) {
        superheroes.remove(findById(id).orElseThrow());
    }
}
