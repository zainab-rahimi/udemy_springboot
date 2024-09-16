package com.zainab.example8.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
