/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ShapeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double w, h, r;

        System.out.println("Enter width and heigth: ");
        Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
        rectangle.printInfo();

        System.out.println("Enter width and heigth: ");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble());
        triangle.printInfo();
        
        System.out.println("Enter radius: ");
        Circle circle = new Circle(input.nextDouble());
        circle.printInfo();
    }

}
