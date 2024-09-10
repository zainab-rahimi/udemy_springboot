package com.zainab.example6.beans;

import org.springframework.stereotype.Component;

@Component
public class Grade {
    private int final_grade = 30;

    public int getFinal_grade() {
        return final_grade;
    }

    public void setFinal_grade(int final_grade) {
        this.final_grade = final_grade;
    }

    public Grade() {
        System.out.println("Grade Constructor, bean created");
    }

    @Override
    public String toString() {
        return "Grade{" +
                "final_grade=" + final_grade +
                '}';
    }
}
