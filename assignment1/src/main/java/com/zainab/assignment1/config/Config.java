package com.zainab.assignment1.config;

import com.zainab.assignment1.beans.Car;
import com.zainab.assignment1.interfaces.Speaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.zainab.assignment1.implementation"
                ,"com.zainab.assignment1.service"})
@ComponentScan(basePackageClasses = {com.zainab.assignment1.beans.Car.class
            ,com.zainab.assignment1.beans.Person.class})
public class Config {


}
