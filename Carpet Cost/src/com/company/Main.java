package com.company;

public class Main {

    public static void main(String[] args) {


        Floor floor= new Floor(80, 50);
        Carpet carpet= new Carpet(190);
        Calculator calculator= new Calculator(floor, carpet);


        System.out.println(calculator.getTotalCost());
    }
}
