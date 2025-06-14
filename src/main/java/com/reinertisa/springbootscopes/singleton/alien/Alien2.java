package com.reinertisa.springbootscopes.singleton.alien;

import org.springframework.stereotype.Component;

@Component
public class Alien2 {
    private Long id;
    private String brand;
    private Laptop laptop;

    public Alien2(Laptop laptop) {
        this.laptop = laptop;
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
        return "Alien2{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
