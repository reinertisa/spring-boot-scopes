package com.reinertisa.springbootscopes.singleton.person;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("animalRunner")
@Order(10)
public class AppAnimalRunner implements CommandLineRunner {

    private final Animal animal1;
    private final Animal animal2;
    private final Person person;

    public AppAnimalRunner(@Qualifier("cat") Animal animal1, @Qualifier("dog") Animal animal2, Person person) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.person = person;
    }
    @Override
    public void run(String... args) throws Exception {
        animal1.sound();
        animal2.sound();

        person.setAnimals(Arrays.asList(animal1, animal2));

        person.showAnimals();
    }
}
