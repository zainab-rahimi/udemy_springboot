package com.zainab.example3.main;

import com.zainab.example3.beans.Car;
import com.zainab.example3.beans.Sport;
import com.zainab.example3.config.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        /*Context is like a memory location of the app in which we add all the object instances
        that we want that Spring manage.
        We create one context and we use the function getBean() to add the other object instances
         */
        var context = new AnnotationConfigApplicationContext(config.class);
        Sport sport = context.getBean(Sport.class);
        System.out.println("From spring context, sport name is " +sport.getName() );
        sport.description();

        Car car = context.getBean(Car.class);
        System.out.println("From car1, car description is " +car.getName() );

    }
}
