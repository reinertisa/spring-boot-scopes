package com.reinertisa.springbootscopes.prototype.service2;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class RepairService1 {
    private final ApplicationContext applicationContext;
    private Laptop laptop;
    public RepairService1(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void setLaptopConfiguration() {
        Laptop laptop = applicationContext.getBean(Laptop.class);
        this.laptop = laptop;
        laptop.setId(1);
        laptop.setBrand("Sony");
    }

    public void displayLaptopConfig() {
        if (laptop != null) {
            System.out.println(laptop);
        }
    }
}
