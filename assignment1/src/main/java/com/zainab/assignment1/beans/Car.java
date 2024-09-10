package com.zainab.assignment1.beans;

import com.zainab.assignment1.service.CarService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private final CarService carService;

    @Autowired
    public Car(CarService carService) {
        this.carService = carService;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarService getCarService() {
        return carService;
    }

    @PostConstruct
    public void init(){
        this.model = "BMW 2024";
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }



}
