package com.zainab.practice.implementation;

import com.zainab.practice.interfaces.Brand;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Iphone implements Brand {

    @Override
    public String brandName() {
        return "Of course iphone comes from Apple!";
    }
}
