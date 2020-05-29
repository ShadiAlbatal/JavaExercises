package com.company;

public class Delux extends BaseHumburger{

    private boolean delux;

    public Delux(String name, String meat, String bread, boolean delux) {
        super(name, meat, bread);
        this.delux = delux;
    }

    public void makeBurger(boolean delux) {
        if(delux){
            System.out.println("delux burger is made");
        }
    }
}
