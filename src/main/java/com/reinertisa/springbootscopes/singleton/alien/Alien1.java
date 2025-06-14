package com.reinertisa.springbootscopes.singleton.alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="alien")
@Scope(value = "singleton")
public class Alien1 {
    private int id;
    private String name;
    private Laptop laptop;

    @Autowired
    public Alien1(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Alien1 created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show() {
        laptop.display();
    }

    @Override
    public String toString() {
        return "Alien1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
