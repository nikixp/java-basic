package com.example.shapes;

/**
 *
 * @author Student
 */
public class Shape {

    public double width;
    public double height;
    public double radius;

    public Shape() {
    }

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
