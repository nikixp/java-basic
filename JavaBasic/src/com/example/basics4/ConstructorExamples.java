/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics4;

import java.util.Objects;

/**
 *
 * @author Student
 */
public class ConstructorExamples {

    private String name = null;

    private int[] numbers;

    public ConstructorExamples() {
    }

    public ConstructorExamples(int... numbers) {
        this.numbers = numbers;
    }

    public ConstructorExamples(String name) {
        this.name = name;
    }

    public ConstructorExamples(String name, int... numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConstructorExamples other = (ConstructorExamples) obj;
        return Objects.equals(this.name, other.name);
    }
    
    
}
