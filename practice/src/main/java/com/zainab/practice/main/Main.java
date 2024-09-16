package com.zainab.practice.main;

import com.zainab.practice.beans.Person;
import com.zainab.practice.beans.Phone;
import com.zainab.practice.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        Phone phone = context.getBean(Phone.class);

        System.out.println(person.getPhone());
    }

}
