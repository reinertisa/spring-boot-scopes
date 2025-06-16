package com.reinertisa.springbootscopes.prototype.laptop2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Student2 {

    private final List<Laptop3> laptops;

    public Student2(List<Laptop3> laptops) {
        this.laptops = new ArrayList<>(laptops);
    }

    public void addLaptop(Laptop3 laptop) {
        laptops.add(laptop);
    }

    public boolean removeLaptop(Laptop3 laptop) {
        return laptops.remove(laptop);
    }

    public void removeAllLaptops() {
        laptops.clear();
    }

    public void addAllLaptops(List<Laptop3> laptopList) {
        laptops.addAll(laptopList);
    }

    public List<Laptop3> getLaptops() {
        return laptops;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "laptops=" + laptops +
                '}';
    }

    public void showLaptops() {
        laptops.forEach(System.out::println);
    }
}
