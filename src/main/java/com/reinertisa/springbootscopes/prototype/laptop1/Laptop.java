package com.reinertisa.springbootscopes.prototype.laptop1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("laptop6")
@Scope("prototype")
public class Laptop {
    private String brand;
    private String model;

    public Laptop() {
    }

    public Laptop(String brand, String model) {
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
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
