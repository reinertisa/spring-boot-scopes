package com.reinertisa.springbootscopes.singleton.animal2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "cat1")
@Scope(value = "singleton")
public class Cat extends Animal2 {
    private Double speed;

    public Cat() {
    }

    public Cat(Double speed) {
        this.speed = speed;
    }

    public Cat(Long id, String name, Double speed) {
        super(id, name);
        this.speed = speed;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "speed=" + speed +
                '}';
    }
}
