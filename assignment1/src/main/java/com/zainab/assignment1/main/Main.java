package com.zainab.assignment1.main;

import com.zainab.assignment1.beans.Car;
import com.zainab.assignment1.beans.Person;
import com.zainab.assignment1.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        //String [] persons = context.getBeanNamesForType(Person.class);
        Person person = (Person) context.getBean("person");
        String [] cars = context.getBeanNamesForType(Car.class);
        Car car = context.getBean(Car.class);
        person.getCar().getCarService().moveCar();
        person.getCar().getCarService().playMusic();
        car.getCarService().moveCar();

    }
}
