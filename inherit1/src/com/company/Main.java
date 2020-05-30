package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle vehicle= new Vehicle("cae", 4, 1, 200, 210);

        Car car= new Car("cart", 200, 210,  true, 4, 1 );

        AutomaticCar automaticCar= new AutomaticCar("ato", 199, 220,true, 2, "auto");

        ManualCar manualCar= new ManualCar("mana", 300, 280,false, 4, 1, "mn");

        Mobeds mobeds= new Mobeds("mbd",2, 1,100, 50);


        manualCar.changeGear((byte) 5);

        automaticCar.accelerate(300);
        manualCar.accelerate(100);

        vehicle.move();
        manualCar.move();
        automaticCar.move();


        mobeds.accelerate(50);

        System.out.println(mobeds.getBredd());
    }
}
