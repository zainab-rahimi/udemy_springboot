package com.zainab.example5.config;

import com.zainab.example5.beans.Car;
import com.zainab.example5.beans.Person;
import com.zainab.example5.beans.Sport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean
    public Car car(){
        Car car = new Car();
        car.setModel("new model 2024");
        return car;
    }

    /*
    We can add dependency using two different method either by
        1. calling the method
        2. Using method parameter (adding parameters to the bean)
     */
    @Bean

    public Person person(){
        Person person = new Person();
        person.setName("Zainab");
        person.setCar(car()); // wiring using method call
        return person;
    }
    /*
    In the below bean I used method parameter to add the wiring between beans
     */
    @Bean
    public Sport sport(Person person){
        Sport s1 = new Sport();
        s1.setSportName("Volleyball");
        person.setName("Goli");
        return s1;

    }
}
