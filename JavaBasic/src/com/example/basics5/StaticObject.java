/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics5;

/**
 *
 * @author Student
 */
public final class StaticObject {
    
    public static String objectName = "static name";

    public StaticObject() {
    }

    
    
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        StaticObject.objectName = objectName;
    }

    public void info(){
        System.out.println(getObjectName());
    }
    
}
