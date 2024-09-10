package com.zainab.assignment1.implementation;

import com.zainab.assignment1.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyre implements Tyre {
    @Override
    public String move() {
        return "Car is moving with BridgeStone Tyres";
    }
}
