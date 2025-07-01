package com.reinertisa.springbootscopes.prototype.student;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class Student {
    private List<Calculator> calculators;

    public Student(List<Calculator> calculators) {
        this.calculators = new ArrayList<>(calculators);
    }

    public List<Calculator> getCalculators() {
        return calculators;
    }

    public void setCalculators(List<Calculator> calculators) {
        this.calculators = calculators;
    }

    @Override
    public String toString() {
        return "Student{" +
                "calculators=" + calculators +
                '}';
    }

    public void showCalculators() {
        calculators.forEach(System.out::println);
    }
}
