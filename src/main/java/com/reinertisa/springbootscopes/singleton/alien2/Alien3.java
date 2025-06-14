package com.reinertisa.springbootscopes.singleton.alien2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value = "alien3")
@Scope(value = "singleton")
public class Alien3 {
    private Long id;
    private String name;
    private List<Laptop2> laptops;

    public Alien3(List<Laptop2> laptops) {
        this.laptops = new ArrayList<>(laptops);
    }

    public void addLaptop(Laptop2 laptop) {
        laptops.add(laptop);
    }

    public boolean removeLaptop(Laptop2 laptop) {
        return laptops.remove(laptop);
    }

    public void removeAllLaptops() {
        laptops.clear();
    }

    public void addAllLaptops(List<Laptop2> laps) {
        laptops.addAll(laps);
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

    public List<Laptop2> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop2> laptops) {
        this.laptops = laptops;
    }

    public void showLaptops() {
        System.out.println("Alien3 has the following laptops");
        laptops.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Alien3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
