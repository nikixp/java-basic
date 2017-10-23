/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics6;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class TestAnimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Въведете тип животно: Cat, Dog");
        String animalType = input.nextLine();
        if (animalType == "Cat") {
            System.out.println("Въведете възраст, име, пол:");
            Animal animal = new Cat(input.nextInt(), input.nextLine(), (char) input.nextByte());
            animal.animalInfo();
        } else if (animalType == "Dog") {
            System.out.println("Въведете възраст, име, пол:");
            Animal animal = new Cat(input.nextInt(), input.nextLine(), (char) input.nextByte());
            animal.animalInfo();
        } else {
            System.out.println("Няма такова животно!");
        }

    }
}
