package com.zainab.example2.main;

import com.zainab.example2.beans.Vehicle;
import com.zainab.example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle = context.getBean(Vehicle.class);

        System.out.println(vehicle.getModel());
    }
}
