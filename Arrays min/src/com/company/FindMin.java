package com.company;

import java.util.Scanner;

public class FindMin {

    private static Scanner scanner= new Scanner(System.in);


    public int[] enterNumbers(int count){
        int[] gatherElementsinArray = new int[count];
        //int gatherElementsinArray[]= new int[count];

        for (int i= 0; i<count; i++){
            System.out.println("enter elemnt: "+ i);
            gatherElementsinArray[i]= scanner.nextInt();
        }
        return gatherElementsinArray;
    }

    public int findMinNum(int[] anArray){
        int min= Integer.MAX_VALUE;

//        for (int i=0; i<anArray.length; i++){
//            if (anArray[i]<min){
//                min= anArray[i];
//            }
//            else {
//                continue;
//            }3
//        }

        for (int value : anArray) {
            if (value < min) {
                min = value;
            }
        }
        scanner.close();
        return min;
    }
}
