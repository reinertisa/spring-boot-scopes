package com.reinertisa.springbootscopes.singleton.alien2;

public class Laptop2 {
    private Long lid;
    private String brand;
    private String model;

    public Laptop2() {
    }

    public Laptop2(Long lid, String brand, String model) {
        this.lid = lid;
        this.brand = brand;
        this.model = model;
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void showConfig() {
        System.out.println("laptop id: " + lid);
        System.out.println("brand name " + brand);
    }

    @Override
    public String toString() {
        return "Laptop2{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
