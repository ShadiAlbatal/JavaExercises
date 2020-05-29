package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] dd= new int[3];
        int[] f= dd;

        ds(dd);
        ds(f);
        System.out.println(Arrays.toString(dd));
        System.out.println(Arrays.toString(f));


        System.out.println(Arrays.toString(d(dd)));
        System.out.println(Arrays.toString(d(f)));
    }
private static int[] d(int[] ar){
        ar[1]= 2;
        ar= new int[]{1,2,3,4};
        return ar;
}

    private static void ds(int[] ar){
        ar[1]= 2;
        ar= new int[]{1,2,3,4};
    }

}
