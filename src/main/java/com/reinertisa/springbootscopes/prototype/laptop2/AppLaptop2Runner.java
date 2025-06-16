package com.reinertisa.springbootscopes.prototype.laptop2;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(8)
public class AppLaptop2Runner implements CommandLineRunner {

    private final Student2 student;

    public AppLaptop2Runner(Student2 student) {
        this.student = student;
    }

    @Override
    public void run(String... args) throws Exception {
        student.showLaptops();
    }
}
