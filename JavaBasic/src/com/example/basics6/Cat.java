/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics6;

/**
 *
 * @author Student
 */
public class Cat extends Animal {

    public Cat(int age, String name, char gender) {
        super(age, name, gender);
    }

    @Override
    public String getSound() {
        return "Miaow";
    }

}
