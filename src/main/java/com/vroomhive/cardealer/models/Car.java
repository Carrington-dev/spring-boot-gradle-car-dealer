package com.vroomhive.cardealer.models;

public class Car {
    private int id;
    private String title;
    private Make make;
    private String year;

    public Car(int id, String title, Make make, String year) {
        this.id = id;
        this.title = title;
        this.make = make;
        this.year = year;
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

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
