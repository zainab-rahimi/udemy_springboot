package com.zainab.example7.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name ="Zainab";
    private final Car car;
    @Autowired
    public Person(Car car) {
        System.out.println("Person bean constructor is created by Spring");
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }


}
