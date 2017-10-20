package com.example.supers;

/**
 *
 * @author Student
 */
public class ClassB extends ClassA {

    public ClassB() {
        System.out.println("ClassB constructor");
    }

    public void methodB(){
        System.out.println("ClassB methodB ");
    }

    @Override
    public void methodA() {
        System.out.println("ClassB methodA ");
    }
}
