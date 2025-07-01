package com.reinertisa.springbootscopes.prototype.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("singleton")
public class User {
    private String name;
    private List<Phone> phones;

    public User() {
    }

    public User(String name, List<Phone> phones) {
        this.name = name;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void showPhones() {
        phones.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
