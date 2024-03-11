package com.vroomhive.cardealer.models;

public class Make {
    private int id;
    private String title;
    private String brand;

    public Make(int id, String title, String brand) {
        this.id = id;
        this.title = title;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
