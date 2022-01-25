package com.mekveto.vetoapp.service;

import com.mekveto.vetoapp.entity.Animal;

import java.util.List;

public interface IAnimalService {

    Animal saveAnimal(Animal animal);

    void deleteAnimal(Long id);

    List<Animal> findAllAnimals();

}
