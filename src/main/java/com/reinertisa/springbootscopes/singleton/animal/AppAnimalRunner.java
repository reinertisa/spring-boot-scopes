package com.reinertisa.springbootscopes.singleton.animal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class AppAnimalRunner implements CommandLineRunner {
    private final AnimalShelter1 animalShelter1;
    private final AnimalShelter2 animalShelter2;

    public AppAnimalRunner(AnimalShelter1 animalShelter1, AnimalShelter2 animalShelter2) {
        this.animalShelter1 = animalShelter1;
        this.animalShelter2 = animalShelter2;
    }
    @Override
    public void run(String... args) throws Exception {
        animalShelter1.sendEmail("Sade", "Isa", "Hey, girl");
        animalShelter2.sendEmail("Addie", "Kristi", "Hey, baby");
    }
}
