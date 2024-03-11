package com.vroomhive.cardealer.controllers;

import com.vroomhive.cardealer.models.Car;
import com.vroomhive.cardealer.models.Make;
import com.vroomhive.cardealer.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService = new CarService();

    @GetMapping("/")
    public String getHome(){return "<h1>Welcome to Vroomhive Platform</h1>"; }


    @GetMapping("/cars")
    public List<Car> getAllCars(){

        return carService.getAllCars();
    }

    @GetMapping("/makes")
    public List<Make> getAllMakes(){

        return carService.getAllMakes();
    }

}
