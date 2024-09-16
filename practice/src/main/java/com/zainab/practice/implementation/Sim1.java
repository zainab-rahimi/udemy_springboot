package com.zainab.practice.implementation;

import com.zainab.practice.interfaces.Simcard;

public class Sim1 implements Simcard{
    @Override
    public String findConn() {
        return "Free Simcard finds connection very well in cities";
    }
}
