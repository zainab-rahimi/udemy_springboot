package com.zainab.practice.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("phoneBean")
public class Phone {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @PostConstruct
    public void init() {
        number = "123";
    }

    public void sayHi(){
        System.out.println("This message is coming from Phone Bean; Hi bitch, don't forget to work today");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                '}';
    }
}
