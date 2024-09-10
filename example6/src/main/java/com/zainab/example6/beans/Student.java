package com.zainab.example6.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name = "Mamad";

    /*
    Create attribute of the other bean class and pass it as parameter
    to constructor
    if we have only one constructor inside your class mentioning the
    '@Autowired' is optional


   Auto wiring using constructor
    */
    @Autowired
    public Student(Grade grade) {
        this.grade = grade;
    }

    //@Autowired   //Autowiring using class field, not recommended since we can't make the field final
    private Grade grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }
    @Autowired // Autowiring using Setter method, not recommended - hard for readability
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
