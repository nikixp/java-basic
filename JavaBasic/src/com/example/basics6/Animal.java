package com.example.basics6;

/**
 *
 * @author Student
 */
public abstract class Animal {

    private int age;
    
    private String name;
    
    private char gender;

    public Animal() {
    }

    public Animal(Integer age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void animalInfo(){
        System.out.println("name: " + this.name + " gender: " + this.gender + " age: " + this.age + " sound: " + this.getSound());
    };

    public abstract String getSound();
    
}
