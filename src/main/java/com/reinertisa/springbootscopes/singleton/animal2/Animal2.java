package com.reinertisa.springbootscopes.singleton.animal2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "animal2")
@Scope(value = "singleton")
public class Animal2 {
    private Long id;
    private String name;

    public Animal2() {
        System.out.println("Animal created");
    }

    public Animal2(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
