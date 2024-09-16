package com.zainab.example10.main;

import com.zainab.example10.beans.Car;
import com.zainab.example10.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
in this example we have added @Prototype in our java class car and here we see that when we run
the program, since we are calling context.getBean 2 times each time the program create a new
instance in the memory. We see that the hashCode and the reference address of the two instances are
different and if we remove the @Scope(BeanDefinition.SCOPE_PROTOTYPE) from the car class, our both
instances will have the same memory reference and hashCode
 */
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        Car car1 = context.getBean(Car.class);
        Car car2 = context.getBean (Car.class);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}
