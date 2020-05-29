package com.company;

public class Point {

    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }



    public double xDistance(Point point){
        return Math.abs(this.getX() - point.getX());

    }

    public double yDistance(Point point){
        return Math.abs(this.getY() - point.getY());
    }

    public double distanceTo(Point point){
        return Math.hypot(this.xDistance(point), this.yDistance(point));
    }




}
