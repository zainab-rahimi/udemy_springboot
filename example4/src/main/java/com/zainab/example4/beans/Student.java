package com.zainab.example4.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initialize() {
        this.name = "Farida";
    }
    public void sayHello(){
        System.out.println("Hello World from Component");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Application is closing ...");
    }
}
