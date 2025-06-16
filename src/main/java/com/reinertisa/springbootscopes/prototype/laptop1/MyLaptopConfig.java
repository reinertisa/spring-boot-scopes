package com.reinertisa.springbootscopes.prototype.laptop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MyLaptopConfig {

    private final ApplicationContext context;

    public MyLaptopConfig(ApplicationContext context) {
        this.context = context;
    }

    public void assignLaptopsToStudent(Student student) {
        Laptop laptop1 = context.getBean(Laptop.class);
        laptop1.setBrand("IBM");
        laptop1.setModel("Lenovo");

        Laptop laptop2 = context.getBean(Laptop.class);
        laptop2.setBrand("Dell");
        laptop2.setModel("Lenovo");

        List<Laptop> laptops = Arrays.asList(laptop1, laptop2);

        student.setLaptops(laptops);
    }


}
