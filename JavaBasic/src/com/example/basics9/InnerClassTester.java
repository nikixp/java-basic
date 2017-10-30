package com.example.basics9;

import com.example.basics9.Earth.Continentals;
import com.example.basics9.Earth.Continentals.Europe;

/**
 *
 * @author Student
 */
public class InnerClassTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Europe europe = new Earth().new Continentals(2).new Europe(new Earth().new Continentals(1));
        System.out.println(europe);
        
        
    }
    
}
