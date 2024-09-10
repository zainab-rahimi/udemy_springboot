package com.zainab.example7.config;

import com.zainab.example7.beans.Car;
import com.zainab.example7.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.zainab.example7.beans")
public class Config {
    @Bean
    Car car1(){
        var car = new Car();
        car.setModel("Tesla 2024");
        return car;

    }
    @Bean
    Car car2(){
        var car = new Car();
        car.setModel("BMW 2024");
        return car;

    }
    @Primary
    @Bean
    Car car3(){
        var car = new Car();
        car.setModel("Suzuki 2024");
        return car;

    }

}
