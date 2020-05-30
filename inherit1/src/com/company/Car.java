package com.company;

public class Car extends Vehicle {

    private int seats;
    private int spareTear;
    private boolean moveBack;
    private boolean autPilot;


    public Car(String name, double length, double bredd, boolean autPilot, int seats, int spareTear) {
        super(name, 4, 1, length, bredd);
        this.seats = seats;
        this.spareTear = spareTear;
        this.autPilot = autPilot;

    }

    public int getSeats() {
        return seats;
    }

    public int getSpareTear() {
        return spareTear;
    }

    public boolean isMoveBack() {
        return moveBack;
    }
    public boolean isAutPilot() {
        return autPilot;
    }

    @Override
    public void move() {
        System.out.println("car is moving");
    }

    @Override
    public void accelerate(double accelrate) {
        System.out.println("car is accelerating with " + accelrate);
    }

    protected void changeGear(byte gear){
        System.out.println("changing gear "+ gear);
    }


}
