package com.reinertisa.springbootscopes.prototype.laptop1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("singleton")
public class Student {
    private String name;
    private List<Laptop> laptops;

    public Student() {
    }

    public Student(List<Laptop> laptops, String name) {
        this.laptops = laptops;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showLaptops() {
        laptops.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Student3{" +
                "laptops=" + laptops +
                ", name='" + name + '\'' +
                '}';
    }
}
