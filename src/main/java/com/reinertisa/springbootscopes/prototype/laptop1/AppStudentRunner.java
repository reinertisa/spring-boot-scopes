package com.reinertisa.springbootscopes.prototype.laptop1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStudentRunner implements CommandLineRunner {
    private final Student student;
    private final MyLaptopConfig myLaptopConfig;

    public AppStudentRunner(Student student, MyLaptopConfig myLaptopConfig) {
        this.student = student;
        this.myLaptopConfig = myLaptopConfig;
    }
    @Override
    public void run(String... args) throws Exception {
        myLaptopConfig.assignLaptopsToStudent(student);
        student.showLaptops();
    }
}
