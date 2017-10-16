package com.example;

import com.example.basics4.JavaTermometer;
import com.example.basics4.SystemTriangle;
import java.util.Scanner;


/**
 *
 * @author Student
 */
public class JavaBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new SystemTriangle(10);
        Scanner scanner = new Scanner(System.in);
        JavaTermometer javaTermometer = new JavaTermometer();
        javaTermometer.calculateFahrenheit(scanner.nextDouble());
    }
    
}
