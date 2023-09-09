package com.example.janpet.controllers;

import com.example.adoption.models.Animal;
import com.example.adoption.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    // Criar uma nova postagem de animal
    @PostMapping
    public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) {
        Animal newAnimal = animalService.createAnimal(animal);
        return ResponseEntity.ok(newAnimal);
    }

    // Obter informações de um animal pelo ID
    @GetMapping("/{animalId}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long animalId) {
        Animal animal = animalService.getAnimalById(animalId);
        return ResponseEntity.ok(animal);
    }

    // Listar todos os animais disponíveis para adoção
    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals() {
        List<Animal> animals = animalService.getAllAnimals();
        return ResponseEntity.ok(animals);
    }

    // Outras operações, como atualização e exclusão, podem ser adicionadas conforme necessário
}
