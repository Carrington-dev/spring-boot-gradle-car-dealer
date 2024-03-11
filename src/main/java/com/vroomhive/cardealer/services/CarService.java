package com.vroomhive.cardealer.services;

import com.vroomhive.cardealer.models.Car;
import com.vroomhive.cardealer.models.Make;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    Make make = new Make(1, "C-HR","Toyota");
    Make makeTwo = new Make(2, "Yaris","Toyota");
    Make makeThree = new Make(3, "Cross","Toyota");
    Make makeFour = new Make(4, "Fortuner","Toyota");

    public List<Car> carList = new ArrayList<>(Arrays.asList(
            new Car(1, "New Toyota C-HR", make, "2023"),
            new Car(2, "New Toyota C-HR", makeTwo, "2023"),
            new Car(3, "New Toyota C-HR", makeThree, "2023"),
            new Car(4, "New Toyota C-HR", makeFour, "2023")
    ));

    public List<Make> makeList = new ArrayList<>(Arrays.asList(
            make,
            makeTwo,
            makeThree,
            makeFour

    ));

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Make> getAllMakes() {
        return  makeList;
    }
}
