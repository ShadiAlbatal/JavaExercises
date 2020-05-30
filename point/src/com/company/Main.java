package com.company;

public class Main {

    public static void main(String[] args) {


        // d(A,B)= √√(xB-xA)*(xB-xA) + (yB-yA)*(yB-yA)
        // d(A,B)= √(3-5)*(3-5) + (1,6)*(1-6)


        Point A= new Point(5,6);

        Point B= new Point(3,1);

        Point point= new Point();


        System.out.println(A.distance());
        System.out.println(A.distance(B));
        System.out.println(A.distance(2,2));
        System.out.println(point.distance());






    }
}

