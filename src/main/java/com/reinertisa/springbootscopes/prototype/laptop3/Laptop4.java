package com.reinertisa.springbootscopes.prototype.laptop3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("laptop10")
@Scope("prototype")
public class Laptop4 {
    private String brand;
    private String model;

    public Laptop4() {}

    public Laptop4(String brand, String model) {
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
        return "Laptop4{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
