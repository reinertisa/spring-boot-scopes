package com.reinertisa.springbootscopes.singleton.animal2;


public class Animal {
    private Long id;
    private String name;

    public Animal() {
        System.out.println("Animal created");
    }

    public Animal(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public void sound() {
        System.out.println("Animal sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
