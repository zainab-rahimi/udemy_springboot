package com.zainab.example8.main;

import com.zainab.example8.beans.Car;
import com.zainab.example8.config.Config;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        Car car1 = context.getBean(Car.class);
        Car car2 = context.getBean(Car.class);

        // the two instance are the same one --> 1 instance per each bean of the same type
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
