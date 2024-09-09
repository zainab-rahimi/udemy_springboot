package com.zainab.example2.config;

import com.zainab.example2.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setModel("new model");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setModel("model 2023");
        return veh;
    }
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setModel("model 2022");
        return veh;
    }

}
