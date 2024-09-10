package com.zainab.assignment1.implementation;

import com.zainab.assignment1.interfaces.Speaker;

public class BoseSpeaker implements Speaker {

    @Override
    public String makeSound() {
        return "sound coming from Bose";
    }
}

