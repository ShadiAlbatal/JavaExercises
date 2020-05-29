package com.company;

public class Rectangle{

    //Add the fields necessary to create a rectangle here.
    //Make use of the Line class


    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;

    public Rectangle(Line line1, Line line2, Line line3, Line line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    //Implement a method which returns the circumreference of the rectangle
    public double circumreference(){
        // p= 2l + 2w
        return 2*(line1.length() + line2.length());
    }

    //Implement a method which returns the area of the rectangle
    public double area(){
        // a= l * w

        return line1.length() * line2.length();
    }

}


