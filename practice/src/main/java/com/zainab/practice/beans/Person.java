package com.zainab.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {
    private String name = "Mahtab";
    private final Phone phone;
    @Autowired
    public Person(Phone phone) {
        this.phone = phone;
    }
    public Phone getPhone() {
        return phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
