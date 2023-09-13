package com.csc205.project1;

import java.text.DecimalFormat;

public class Point {

    private double x;
    private double y;

    //Point Constructors
    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Distance

    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    //Getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Shift

    public void shiftX(double n) {
        x += n;
    }

    public void shiftY(double n) {
        y += n;

    }

    //Rotation

    public void rotate(double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);
        double newX = x * cosTheta - y * sinTheta;
        double newY = x * sinTheta + y * cosTheta;
        x = newX;
        y = newY;
    }

    //String
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Point{x " + df.format(x) + ", y = " + df.format(y) + "}";
    }
}

