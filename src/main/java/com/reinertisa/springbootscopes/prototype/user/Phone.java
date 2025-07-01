package com.reinertisa.springbootscopes.prototype.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("phone1")
@Scope("prototype")
public class Phone {
    private String brand;
    private String model;

    public Phone() {
    }

    public Phone(String brand, String model) {
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
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
