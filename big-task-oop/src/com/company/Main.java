package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        BaseHumburger humburger= new BaseHumburger("regualrburger", "chicken", "white");
        Healthy healthyburger= new Healthy("healthy", "meat", "brown");

        //humburger.menu();

        //System.out.println(humburger.addTomato(6));

        //humburger.makeBurger(false, false, 1, 0);

        humburger.makeBurger(false,true,3,1);
        //healthyburger.makeBurger(1,1,1,1);

        //healthyburger.makeBurger(0,0,0,0,1,1);
    }
}