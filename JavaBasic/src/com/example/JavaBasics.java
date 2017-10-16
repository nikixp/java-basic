package com.example;

import com.example.basics4.BuilderExample;
import com.example.basics4.JavaTermometer;
import com.example.basics4.Sorter;
import com.example.basics4.Student;
import com.example.basics4.SystemTriangle;
import java.util.Arrays;
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
        /*Scanner scanner = new Scanner(System.in);
        JavaTermometer javaTermometer = new JavaTermometer();
        javaTermometer.calculateFahrenheit(scanner.nextDouble());*/

 /*Sorter sorter = new Sorter(new int[]{8, 5, 3, 7, 8, 2, 1});
        sorter.sort();
        System.out.println(Arrays.toString(sorter.getNumbers()));*/
        Student student1 = new Student("Student Name", "I", "Engineer", "Sofia Univercity", "student@asd.bg", "0881234567");
        System.out.println("student1: " + student1.toString());

        Student student2 = new Student("Student Name2", "II", "student2@asd.bg", "+35988888888");
        System.out.println("student2: " + student2.toString());
    }

}
