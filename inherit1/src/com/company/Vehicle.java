package com.company;

public class Vehicle {

    private String name;
    private int weels;
    private int motor;
    private double length;
    private double bredd;

    public Vehicle(String name, int weels, int motor, double length, double bredd) {
        this.name = name;
        this.weels = weels;
        this.motor = motor;
        this.length = length;
        this.bredd = bredd;
    }

    public String getName() {
        return name;
    }

    public int getWeels() {
        return weels;
    }

    public int getMotor() {
        return motor;
    }

    public double getLength() {
        return length;
    }

    public double getBredd() {
        return bredd;
    }


    public void move(){
        System.out.println("vehicle is moving");
    }

    public void accelerate(double accelrate){
        System.out.println("vehicle is moving with " + accelrate);
    }

    private void stop(){
        System.out.println("vehicle is stop");
    }

    private void toRight(){
        System.out.println("vehicle is moving right ");
    }

    private void toLeft(){
        System.out.println("vehicle is moving left ");
    }

    private void decrease(){
        System.out.println("vehicle speed decrease ");
    }


}
