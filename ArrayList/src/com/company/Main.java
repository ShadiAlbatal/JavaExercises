package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GrosseryList.printGroseryList();
        GrosseryList.addGrosery("ndandnc");
        GrosseryList.addGrosery("ndandndsfdc");
        GrosseryList.addGrosery("ndadafdfdsfndnc");
        GrosseryList.addGrosery("ndaewrerewrerewrendnc");

        //GrosseryList.printGroseryList();


        //GrosseryList.modifyGrosseryList(0,"f");
        GrosseryList.modifyGrosseryList("ndandnc", "f");


        //GrosseryList.removeGroceryList(2);
        GrosseryList.removeGroceryList("f");


//        GrosseryList.printGroseryList();
//
//
//        GrosseryList.finditem("f");
//
//
//        GrosseryList.findItemGroceryList("fjj");

    }

}
