package com.company;

public class Cat extends Animal{

    private int eyes;

    public Cat(int legs, int eyes) {
        super(legs);
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }



    protected void theLegs(){
        System.out.println(super.getLegs());
    }

    protected void theEyes(){
        System.out.println();
    }
}
