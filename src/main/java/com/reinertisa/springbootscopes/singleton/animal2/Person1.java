package com.reinertisa.springbootscopes.singleton.animal2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("person1")
@Scope("singleton")
public class Person1 {
    private Long id;
    private String name;
    private String email;
    private List<Animal2> animals;

    public Person1() {}

    public Person1(Long id, String name, String email, List<Animal2> animals) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.animals = new ArrayList<>(animals);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Animal2> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal2> animals) {
        this.animals = animals;
    }

    public void showAnimals() {
        animals.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", animals=" + animals +
                '}';
    }
}
