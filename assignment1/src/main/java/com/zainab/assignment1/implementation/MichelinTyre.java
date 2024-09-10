package com.zainab.assignment1.implementation;

import com.zainab.assignment1.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyre implements Tyre {
    @Override
    public String move() {
        return "Car is moving with Michelin tyres";
    }
}
