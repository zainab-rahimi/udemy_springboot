package com.zainab.assignment1.implementation;

import com.zainab.assignment1.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker {
    @Override
    public String makeSound() {
        return "music coming from Sony";
    }
}
