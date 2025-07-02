package com.reinertisa.springbootscopes.prototype.repairservice;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
public class RepairService2 {
    private final ObjectProvider<Laptop> laptopProvider;
    private Laptop laptop;

    public RepairService2(ObjectProvider<Laptop> laptopProvider) {
        this.laptopProvider = laptopProvider;
    }

    public void setLaptopConfig() {
        Laptop laptop = laptopProvider.getObject();
        laptop.setId(10);
        laptop.setBrand("Toshiba");
        this.laptop = laptop;
    }

    public void displayLaptop() {
        if (laptop != null) {
            System.out.println(laptop);
        }
    }
}
