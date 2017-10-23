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
public class Rectangle implements IShape {

    private final Shape shape;

    public Rectangle(double width, double height) {
        this.shape = new Shape(width, height);
    }

    @Override
    public double calculateSurface() {
        return shape.getHeight() * shape.getWidth();
    }

    public void printInfo() {
        System.out.println(this.getClass().getName() + " info:");
        System.out.println(" width: " + shape.getWidth());
        System.out.println(" height: " + shape.getHeight());
        System.out.println(" result: " + calculateSurface());
    }
}
