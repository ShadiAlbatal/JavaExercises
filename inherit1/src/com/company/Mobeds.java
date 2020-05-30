package com.company;

public class Mobeds extends Vehicle {


    public Mobeds(String name, int weels, int motor, double length, double bredd) {
        super(name, weels, motor, length, bredd);
    }

    @Override
    public void move() {
        System.out.println("mobed is moving");
    }

    @Override
    public void accelerate(double accelrate) {
        System.out.println("mobed is accelerating");
    }
}
