package com.mekveto.vetoapp.controller;

import com.mekveto.vetoapp.entity.Animal;
import com.mekveto.vetoapp.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/animal")//pre-path
public class AnimalController {

    @Autowired
    private IAnimalService animalService;

    @PostMapping
    public ResponseEntity<?> saveAnimal(@RequestBody Animal animal)
    {
        return new ResponseEntity<>(animalService.saveAnimal(animal), HttpStatus.CREATED);
    }

    @DeleteMapping("{personId}")
    public ResponseEntity<?> deleteAnimal(@PathVariable Long animalId)
    {
        animalService.deleteAnimal(animalId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllPersons()
    {
        return new ResponseEntity<>(animalService.findAllAnimals(), HttpStatus.OK);
    }

}