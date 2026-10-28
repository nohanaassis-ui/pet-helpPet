package com.senai.pet.controller;

import com.senai.pet.entity.Animal;
import com.senai.pet.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }


    @GetMapping
    public List<Animal> mostrarAnimais(){
        return animalService.mostrarAnimais();
    }

    @PostMapping
    public void criarAnimal(@RequestBody Animal animal){
        animalService.cadastrarAnimal(animal );
    }
}
