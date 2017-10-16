/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics4;

/**
 *
 * @author Student
 */
public class JavaTermometer {

    private double temperature = 0;

    public void calculateFahrenheit(double fTemp) {
        setTemperature(calculateTemperature(fTemp));
        System.out.print("Your body temperature in Celsius degree is ");
        System.out.print(temperature);
        System.out.println("");
        if (temperature > 37) {
            System.out.println("You are ill!");
        }
    }

    private double calculateTemperature(double fTemp) {
        return (fTemp - 32) * 5 / 9;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
