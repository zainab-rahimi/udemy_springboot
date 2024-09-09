package com.zainab.example1.config;

import com.zainab.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
Spring @Configuration annotation indicates that the class has
@Bean definition methods. So Spring container can process the class and
generate Spring Beans to be used in the application.
 */

@Configuration
public class ProjectConfig {

/*
@Bean Annotation lets Spring know that it needs to call this method
when it initializes its context and adds the returned
value to the context.
 */
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setModel("BMW iX");
        return veh;
    }

    @Bean
    String printString(){
        return "from the bean";
    }

    @Bean
    Integer printSpeed(){
        return 34;
    }
}
