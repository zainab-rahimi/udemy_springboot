package com.zainab.example7.main;

import com.zainab.example7.beans.Car;
import com.zainab.example7.beans.Person;
import com.zainab.example7.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Car carBean = context.getBean(Car.class);
        Person personBean = context.getBean(Person.class);

        System.out.println(carBean.getModel());
        System.out.println(personBean.getCar());
    }
}
