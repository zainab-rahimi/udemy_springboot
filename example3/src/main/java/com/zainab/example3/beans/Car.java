package com.zainab.example3.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private  String name = "BMW";
    private int model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }


    public void show_car() {
        System.out.println("Car name: "+ getName() + "model:" + getModel());
    }
}
