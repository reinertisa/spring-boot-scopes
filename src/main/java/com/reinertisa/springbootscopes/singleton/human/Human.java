package com.reinertisa.springbootscopes.singleton.human;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "singleton")
public class Human {
    private Long id;
    private String name;
    private List<Tablet> tablets;

    public Human(List<Tablet> tablets) {
        this.tablets = new ArrayList<>(tablets);
    }

    public void addTablet(Tablet tablet) {
        tablets.add(tablet);
    }

    public boolean removeTablet(Tablet tablet) {
        return tablets.remove(tablet);
    }

    public void removeAllTablets() {
        tablets.clear();
    }

    public void addAllTablets(List<Tablet> laps) {
        tablets.addAll(laps);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tablet> getTablets() {
        return tablets;
    }

    public void setTablets(List<Tablet> tablets) {
        this.tablets = tablets;
    }

    public void showTablets() {
        System.out.println("Human-- has the following tablets");
        if (!tablets.isEmpty()) {
            tablets.forEach(System.out::println);
        }

    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tablets=" + tablets +
                '}';
    }
}
