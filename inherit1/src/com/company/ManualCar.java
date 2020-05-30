package com.company;

public class ManualCar extends Car {

    private String manuel;

    public ManualCar(String name, double length, double bredd, boolean autPilot, int seats, int spareTear, String manuel) {
        super(name, length, bredd, autPilot, seats, spareTear);
        this.manuel = manuel;
    }

    public String getManuel() {
        return manuel;
    }

    @Override
    protected void changeGear(byte gear) {
        System.out.println("changing gear "+ gear);
    }
}
