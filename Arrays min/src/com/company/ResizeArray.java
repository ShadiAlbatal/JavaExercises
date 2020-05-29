package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ResizeArray {


    public static Scanner scanner= new Scanner(System.in);
    static int[] baseArray= new int[7];

    public static int[] acceptArray(){

        for (int i=0; i<baseArray.length ; i++){
            System.out.println("enter nr" +i);
            baseArray[i] = scanner.nextInt();
        }
        return baseArray;
    }

    public static void printBaseArray(int[] baseArray){
        System.out.println(Arrays.toString(baseArray));
    }

    public static void resieIt(){
        int[] baseArray10positionsinsteadof7THREEPOSITIONSADDED= baseArray;
        baseArray= new int[10];
        System.out.println(Arrays.toString(baseArray));
        System.out.println(Arrays.toString(baseArray10positionsinsteadof7THREEPOSITIONSADDED));
        for (int i=0; i<baseArray10positionsinsteadof7THREEPOSITIONSADDED.length; i++) {
            baseArray[i] = baseArray10positionsinsteadof7THREEPOSITIONSADDED[i];

        }
        System.out.println(Arrays.toString(baseArray));

    }

    public static void addValuestoNewPositions(){
        System.out.println(Arrays.toString(baseArray));
        for (int i=7; i<baseArray.length;i++){
            System.out.println("add nr " + i );
             baseArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(baseArray));
    }

}
