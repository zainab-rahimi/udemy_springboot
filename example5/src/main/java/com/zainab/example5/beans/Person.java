package com.zainab.example5.beans;

public class Person {

    private String name;
    private int age;
    private Car car;

public Person() {
    System.out.println("Person constructor: Person instance initialized");
}

    public int getAge() {
        return age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
