package com.zainab.practice.implementation;

import com.zainab.practice.interfaces.Brand;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Brand {
    @Override
    public String brandName() {
        return "All Galaxy phones are from Samsung";
    }
}
