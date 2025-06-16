package com.reinertisa.springbootscopes.prototype.laptop3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppLaptop4Runner implements CommandLineRunner {
    private final ApplicationContext context;
    private final Student3 student;

    public AppLaptop4Runner(ApplicationContext context, Student3 student) {
        this.context = context;
        this.student = student;
    }
    @Override
    public void run(String... args) throws Exception {

        Laptop4 l1 = context.getBean(Laptop4.class);
        Laptop4 l2 = context.getBean(Laptop4.class);

        student.setLaptops(Arrays.asList(l1, l2));

        student.showLaptops();

    }
}
