package com.zainab.example4.main;

import com.zainab.example4.beans.Student;
import com.zainab.example4.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        Student std = context.getBean(Student.class);
        System.out.println("Component student: "+ std.getName());
        std.sayHello();
        context.close();
    }
}
