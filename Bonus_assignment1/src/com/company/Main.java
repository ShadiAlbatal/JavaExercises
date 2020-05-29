package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Point p1= new Point(1000,1000);
//        Point p2= new Point(2,2);
//
//    //    System.out.println(p1.distanceTo(p2));
//
//
//
//        Point line1P1= new Point(1000,1000);
//        Point line1P12= new Point(2,2);
//
//        Point line2P1= new Point(1000,10000);
//        Point line2P12= new Point(2,2);
//
//        Line line1= new Line(line1P1,line1P12);
//        Line line2= new Line(line2P1,line2P12);
//
//
////        System.out.println(line1.getP1());
////        System.out.println(line1.getP2());
//
//
//       System.out.println(line1.length(line2));
//
//
//
//    }
//}

public class Main
{
    public static void main(String[] args){
        //Create a square using the Point, Line, and Square classes
        //Print the area and circumreference of the square
        //Print using the "System.out.println()" command
        Point point1= new Point(1,1);
        Point point2= new Point(1,3);


        System.out.println(point1.xDistance(point2));
        System.out.println(point2.yDistance(point1));

        Line line1= new Line(point1,point2);
        Line line2= new Line(point2, new Point(5,3));

        System.out.println(line1.length());
        System.out.println(line2.length());

        Rectangle rectangle= new Rectangle(
                line1,
                line2,
                new Line(new Point(5,3), new Point(5,1)),
                new Line(new Point(5,1), point1)
        );

        //Area
        System.out.println("area " + rectangle.area());

        //circumreference
        System.out.println("circumreference " + rectangle.circumreference());
    }

}
