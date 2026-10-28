package com.senai.pet.service;

import com.senai.pet.entity.Animal;
import com.senai.pet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

   private final  AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> mostrarAnimais(){
        List<Animal> animalList = new ArrayList<>();
        return animalList = animalRepository.findAll();
    }


    public void cadastrarAnimal(Animal animal){
        Animal animal1= new Animal();
        animal.setNome(animal.getNome());
        animal.setCastrado(animal1.isCastrado());
        animal.setEspecie(animal1.getEspecie());
        animal.setCor(animal1.getCor());
        animal.setRaca(animal1.getRaca());
        animal.setDataNascimento(animal1.getDataNascimento());
        animal.setSexo(animal1.getSexo());
        animal.setVacinacao(animal1.getVacinacao());
        animal.setObservacoes(animal1.getObservacoes());
        animal.setPeso(animal1.getPeso());
        animalRepository.save(animal);
    }
}
