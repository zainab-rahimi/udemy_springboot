package com.zainab.example1.main;

import com.zainab.example1.beans.Vehicle;
import com.zainab.example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("M60");
        System.out.println("the model is from non-spring:" + vehicle.getModel());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("the model from the spring is:" + veh.getModel());
        /*
        to get a bean you pass the data type of the bean that id defined in config file
         */
        String sayHello = context.getBean(String.class);
        System.out.println("String value from the Spring context is :" +sayHello);

        Integer sayInt = context.getBean(Integer.class);
        System.out.println("Integer value from the Spring context is :" +sayInt);
    }

}
