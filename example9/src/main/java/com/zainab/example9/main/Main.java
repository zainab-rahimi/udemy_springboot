package com.zainab.example9.main;

import com.zainab.example9.beans.Student;
import com.zainab.example9.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("We want to try @Lazy instantiation of the bean");
        /*
        When I don't use the @Lazy in the component, just by running the program
        the bean instance is created and we can get the print statement defined
        in the constructor. but if I add the @Lazy the bean instance is only created if
        I run getBean method. to see the result you can comment or uncomment the code below plus
        adding or removing the @Lazy in Student class.
         */
        // Student student = context.getBean(Student.class);
        // System.out.println(student);
    }
}
