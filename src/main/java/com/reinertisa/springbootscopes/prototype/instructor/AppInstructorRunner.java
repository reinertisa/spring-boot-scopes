package com.reinertisa.springbootscopes.prototype.instructor;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class AppInstructorRunner implements CommandLineRunner {

    private final Instructor instructor;

    public AppInstructorRunner(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public void run(String... args) throws Exception {
        instructor.showBooks();
    }
}
