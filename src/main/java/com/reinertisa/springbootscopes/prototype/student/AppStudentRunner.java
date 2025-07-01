package com.reinertisa.springbootscopes.prototype.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(3)
public class AppStudentRunner implements CommandLineRunner {
    private final ApplicationContext context;
    private final Student student;

    public AppStudentRunner(ApplicationContext context, Student student) {
        this.context = context;
        this.student = student;
    }
    @Override
    public void run(String... args) throws Exception {

        Calculator l1 = context.getBean(Calculator.class);
        Calculator l2 = context.getBean(Calculator.class);

        student.setCalculators(Arrays.asList(l1, l2));
        student.showCalculators();
    }
}
