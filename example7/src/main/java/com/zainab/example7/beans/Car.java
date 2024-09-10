package com.zainab.example7.beans;

public class Car {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void saySomething(){
        System.out.println("Car says something");
    }
    @Override
    public String toString() {
        return "Car model is: "+ model;
    }
}
