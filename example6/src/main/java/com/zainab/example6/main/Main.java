package com.zainab.example6.main;

import com.zainab.example6.beans.Grade;
import com.zainab.example6.beans.Student;
import com.zainab.example6.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Student student = context.getBean(Student.class);
        //Grade grade = context.getBean(Grade.class);

        System.out.println("Student from the spring context: " + student.getName());
        //System.out.println("Grade from the spring context: " + grade.getFinal_grade());
        System.out.println("Grade for " + student.getName()
                + " is : " + student.getGrade());
    }
}
