package com.company;

public class AutomaticCar extends Car {

    private String auto;

    public AutomaticCar(String name, double length, double bredd, boolean autPilot, int seats, String auto) {
        super(name, length, bredd, autPilot, seats, 1);
        this.auto = auto;
    }

    @Override
    public void changeGear(byte gear) {
        System.out.println("autio car, no gear");
    }
}
