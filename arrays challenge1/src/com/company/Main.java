package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        int array[]= getArray(3);
        int sorted[]= sortTheArray(array);
        printArray(sorted);

/*        int anArray[]= {2,3,1};
        int list[] = new int[anArray.length];
        for (int i = 0; i < anArray.length; i++) {
            //System.out.println(myArray[i]);
             list[i] += anArray[i];
            //System.out.println(Arrays.toString(list));
        }
        System.out.println(Arrays.toString(list));
   */
    }

    public static int[] getArray(int items){

        int myArray[]= new int[items];
        int[] Myarray= new int[items];

        for(int i= 0; i<myArray.length; i++){
            System.out.println("enter item nr: " + i);
            int item= scanner.nextInt();
            myArray[i] = item;
        }
        // 3System.out.println(Arrays.toString(myArray));

        return myArray;
    }

    public static void printArray(int[] anArray) {

        int list[] = new int[anArray.length];
        for (int i = 0; i < anArray.length; i++) {
            //System.out.println(myArray[i]);
            list[i] += anArray[i];
            //System.out.println(Arrays.toString(list));
        }
        System.out.println(Arrays.toString(list));

    }
    //  0 1 2 3 4
    // [1,5,7,3,2]
    // []

    public static int[] sortTheArray(int[] theArray){
//        int newList[]= new int[theArray.length];
//        newList= theArray;
        int temp;
        boolean flag= true;
        while(flag){
            flag= false;
            for (int i= 0; i<theArray.length -1; i++){
                if (theArray[i] < theArray[i+1]){
                    temp= theArray[i];
                    theArray[i]= theArray[i+1];
                    theArray[i+1]= temp;
                    flag= true;
                }
            }
        }
        return theArray;
    }





    public static int[] sortArray(int theArray[]){
        int newList[]= new int[theArray.length];
        System.out.println(Arrays.toString(newList));

        for (int i= 0; i<theArray.length; i++){
            for (int j= i; j<theArray.length; j++){
                if (theArray[j]> theArray[i]){
                    newList[i]= theArray[i];
                }
            }
            System.out.println(Arrays.toString(newList));
        }
        return newList;
    }
}
