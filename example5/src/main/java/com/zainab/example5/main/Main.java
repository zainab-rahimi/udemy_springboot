package com.zainab.example5.main;

import com.zainab.example5.beans.Car;
import com.zainab.example5.beans.Person;
import com.zainab.example5.beans.Sport;
import com.zainab.example5.config.Config;
import org.springframework.boot.context.ContextIdApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.PersistenceDelegate;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        Sport sport = context.getBean(Sport.class);
        Car car = context.getBean(Car.class);
        System.out.println("Person name from the context is " + person.getName());
        System.out.println("Vehicle model from the context is :" + car.getModel());
        System.out.println("Car than person owns is :" + person.getCar());
        System.out.println("the Sport that "+ person.getName() + "plays is " + sport.getSportName());
        System.out.println("the person that I created "+ person.getName() + "is and he owns a  " + car.getModel());
    }
}
