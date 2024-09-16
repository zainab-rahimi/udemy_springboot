package com.zainab.practice.service;

import com.zainab.practice.interfaces.Brand;
import com.zainab.practice.interfaces.Simcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhoneService {
    private Brand brand;
    private final Simcard simcard;



    @Autowired
    public PhoneService(Brand brand, Simcard simcard) {
        this.simcard = simcard;
        this.brand = brand;
    }
    public Simcard getSimcard() {
        return simcard;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
