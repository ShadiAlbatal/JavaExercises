package com.company;

import java.util.Arrays;

public class ReverseArray {

    public static void array(int[] array){
        System.out.println(Arrays.toString(array));
    }


    ////////// 1 2 3 4 5 6 7
    /////////  7 6 5 4 3 2 1

    public static void reverse(int [] reverseIT){
        int reversed[]= new int[reverseIT.length];
        int temp;
        int halv= reverseIT.length/2;
        int max= reverseIT.length -1;
        int e=0;
            e++;
            for (int i=0; i<halv; i++) {

                temp = reverseIT[i];
               reverseIT[i]= reverseIT[max - i];
               reverseIT[max - i]= temp;
            }

        //}
        System.out.println(Arrays.toString(reverseIT));
    }


}
