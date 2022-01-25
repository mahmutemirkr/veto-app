package com.mekveto.vetoapp.service;

import com.mekveto.vetoapp.entity.Animal;
import com.mekveto.vetoapp.repository.IAnimalRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Data
public class AnimalService implements IAnimalService {

    private final IAnimalRepository animalRepository;

    public AnimalService(IAnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }


    @Override
    public Animal saveAnimal(Animal animal) {

        animal.setCreateTime(LocalDateTime.now());
        return animalRepository.save(animal);
    }


    @Override
    public void deleteAnimal(Long id) {

        animalRepository.deleteById(id);

    }

    @Override
    public List<Animal> findAllAnimals() {

        return animalRepository.findAll();
    }
}
