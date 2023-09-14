package com.csc205.project1;

/*
AI:

Design & implement a class called Point that represents a
location in the Cartesian plane.
Include (at a minimum) the following methods:
setX(double x), setY(double y), setPoint(double x, double y) - set
the coordinates of the point.
shiftX(double n), shiftY(double n) - shift a point by a given
amount along one of the axes.
distance(Point p2) - finds the distance to point p2.
rotate(double angle) - rotates the point by a specified angle
around the origin. The formula for rotation is as follows:
x' = x * cos(theta) - y * sin(theta)
y' = x * sin(theta) + y * cos(theta)
 */

import java.text.DecimalFormat;

public class Point {

    private double x;
    private double y;

    //Point Constructors
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

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

    //Distance

    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);

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
        DecimalFormat decimal = new DecimalFormat("0.0");

        return "Point{x=" + decimal.format(x) + ", y=" + decimal.format(y) + "}";
    }
}

