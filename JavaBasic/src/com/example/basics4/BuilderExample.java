package com.example.basics4;

/**
 *
 * @author Student
 */
public class BuilderExample {
    
    private String name;
    
    private int age;
    
    private double salary;

    public BuilderExample() {
    }

    public String getName() {
        return name;
    }

    public BuilderExample setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public BuilderExample setAge(int age) {
        this.age = age;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public BuilderExample setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "BuilderExample{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }
    
}
