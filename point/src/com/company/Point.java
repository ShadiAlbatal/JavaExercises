package com.company;

public class Point {

    private int x;
    private int y;

    public Point() {
      //  this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
      //  System.out.println(x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
      //  System.out.println(y);
    }


    public double distance(){

        return this.y-this.x;
    }

    public double distance(int x, int y){
        this.x= x;
        this.y= y;
        return this.y-this.x;
    }

    public double distance(Point another){

        return Math.sqrt((another.getX()-this.getX()*another.getX()-this.getX()) + (another.getY()-this.getY()*another.getY()-this.getY()));
    }



}
