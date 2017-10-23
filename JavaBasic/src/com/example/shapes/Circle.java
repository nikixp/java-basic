/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes;

/**
 *
 * @author Student
 */
public class Circle implements IShape {

    private final Shape shape;

    public Circle(double radius) {
        this.shape = new Shape(radius);
    }

    @Override
    public double calculateSurface() {
        return Math.pow(shape.getRadius(), 2) * Math.PI;
    }

    public void printInfo() {
        System.out.println(this.getClass().getName() + " info:");
        System.out.println(" radius: " + shape.getRadius());
        System.out.println(" result: " + calculateSurface());
    }

}
