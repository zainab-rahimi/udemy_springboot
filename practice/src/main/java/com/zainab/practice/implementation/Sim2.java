package com.zainab.practice.implementation;

import com.zainab.practice.interfaces.Brand;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sim2 implements Brand{
    @Override
    public String brandName() {
        return "Sim2 is working in remote areas";
    }
}
