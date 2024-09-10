package com.zainab.example5.beans;

import javax.swing.*;

public class Sport {
    private  String sportName;

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public Sport() {
        System.out.println("Sport Constructor: the sport instance has been created");
    }

    @Override
    public String toString() {
        return "sportName='" + sportName
                ;
    }
}
