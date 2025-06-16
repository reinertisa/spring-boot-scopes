package com.reinertisa.springbootscopes.prototype.laptop3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class Student3 {
    private List<Laptop4> laptops;

    public Student3(List<Laptop4> laptops) {
        this.laptops = new ArrayList<>(laptops);
    }

    public List<Laptop4> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop4> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "laptops=" + laptops +
                '}';
    }

    public void showLaptops() {
        laptops.forEach(System.out::println);
    }
}
