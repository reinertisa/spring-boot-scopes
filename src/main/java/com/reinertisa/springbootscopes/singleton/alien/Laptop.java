package com.reinertisa.springbootscopes.singleton.alien;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "lap")
@Scope(value = "singleton")
public class Laptop {
    private Long id;
    private String brand;

    public Laptop() {
        System.out.println("Laptop created");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("id: " + id + "--" + brand);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
