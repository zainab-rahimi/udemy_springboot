package com.zainab.assignment1.service;

import com.zainab.assignment1.interfaces.Speaker;
import com.zainab.assignment1.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {
    @Autowired
    private Speaker speaker;

    private Tyre tyre;

    /*
   Adding the services (methods) for the car
     */
    public void playMusic(){
        String music = speaker.makeSound();
        System.out.println(music);
    }

    public void moveCar(){
        String movement = tyre.move();
        System.out.println(movement);
    }

    public Speaker getSpeaker() {
        return speaker;
    }
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;

    }
    public Tyre getTyre() {
        return tyre;
    }
    @Autowired
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }



}
