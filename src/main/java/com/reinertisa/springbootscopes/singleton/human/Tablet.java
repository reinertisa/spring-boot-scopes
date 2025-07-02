package com.reinertisa.springbootscopes.singleton.human;

public class Tablet {
    private Long lid;
    private String brand;
    private String model;

    public Tablet() {
    }

    public Tablet(Long lid, String brand, String model) {
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
        return "Tablet{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
