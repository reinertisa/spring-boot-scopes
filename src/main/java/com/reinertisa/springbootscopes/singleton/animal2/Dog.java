package com.reinertisa.springbootscopes.singleton.animal2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "dog")
@Scope(value = "singleton")
public class Dog extends Animal {
    private Long biteLevel;

    public Dog() {

    }

    public Dog(Long biteLevel) {
        this.biteLevel = biteLevel;
    }

    public Dog(Long id, String name, Long biteLevel) {
        super(id, name);
        this.biteLevel = biteLevel;
    }

    public Long getBiteLevel() {
        return biteLevel;
    }

    public void setBiteLevel(Long biteLevel) {
        this.biteLevel = biteLevel;
    }

    public void sound() {
        System.out.println("Dog sounds hav...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "biteLevel=" + biteLevel +
                '}';
    }
}
