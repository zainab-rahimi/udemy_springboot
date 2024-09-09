package com.zainab.example3.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Sport {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name ;

    public void description(){
        System.out.println("Description of the sport ");
    }

    @PostConstruct
    public void init(){
        this.name = " Molla naserdin";
    }
}

