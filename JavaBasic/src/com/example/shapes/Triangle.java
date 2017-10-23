package com.example.shapes;

/**
 *
 * @author Student
 */
public class Triangle implements IShape {

    private final Shape shape;

    public Triangle(double width, double height) {
        this.shape = new Shape(width, height);
    }

    @Override
    public double calculateSurface() {
        return (shape.getWidth() + shape.getWidth()) / 2;
    }

    public void printInfo() {
        System.out.println(this.getClass().getName() + " info:");
        System.out.println(" width: " + shape.getWidth());
        System.out.println(" height: " + shape.getHeight());
        System.out.println(" result: " + calculateSurface());
    }
}
