package com.mekveto.vetoapp.repository;

import com.mekveto.vetoapp.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAnimalRepository extends JpaRepository<Animal, Long> {
    Animal save(Animal animal);

    void deleteById(Long id);

    List<Animal> findAll();
}
