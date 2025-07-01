package com.reinertisa.springbootscopes.prototype.student;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("calculator1")
@Scope("prototype")
public class Calculator {
    private String brand;
    private String model;

    public Calculator() {}

    public Calculator(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
