package com.example;

import com.example.basics4.BuilderExample;
import com.example.basics4.ConstructorExamples;
import com.example.basics4.JavaTermometer;
import com.example.basics4.Sorter;
import com.example.basics4.Student;
import com.example.basics4.SystemTriangle;
import com.example.basics5.Converter;
import com.example.basics5.StaticObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaBasics {

    private static List<Student> students = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new SystemTriangle(10);

        /*ConstructorExamples constructorExamples1 = new ConstructorExamples(0, 1, 2);
        System.out.println(Arrays.toString(constructorExamples1.getNumbers()));
        
        ConstructorExamples constructorExamples2 = new ConstructorExamples(1);
        System.out.println(constructorExamples2.getNumber());*/
 /*Scanner scanner = new Scanner(System.in);
        JavaTermometer javaTermometer = new JavaTermometer();
        javaTermometer.calculateFahrenheit(scanner.nextDouble());*/

 /*Sorter sorter = new Sorter(new int[]{8, 5, 3, 7, 8, 2, 1});
        sorter.sort();
        System.out.println(Arrays.toString(sorter.getNumbers()));*/
 /*Student student1 = new Student("Student Name", 1, "Engineer", "Sofia Univercity", "student@asd.bg", "0881234567");
        student1.getInfoStudent();

        Student student2 = new Student("Student Name2", 2, "student2@asd.bg", "+35988888888");
        student2.getInfoStudent();

        Student student3 = new Student();
        student3.getInfoStudent();*/

 /*StaticObject sObject = new StaticObject();
        sObject.info();
        
        sObject.setObjectName("no static name");
        
        StaticObject sObject2 = new StaticObject();
        sObject2.info();*/
        //test();
        //sout();
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter the number: ");
        Converter converter = new Converter();
        //converter.getLastNumber(input.nextInt());

        System.out.print("Enter the number for revert: ");
        int reverted = converter.reverter(input.nextInt());
        System.out.println(reverted);

    }

    private static void test() {
        students.add(new Student("Student Name", 1, "Engineer", "Sofia Univercity", "student@asd.bg", "0881234567"));
        students.add(new Student("Student Name2", 2, "student2@asd.bg", "+35988888888"));
        students.add(new Student());
    }

    public static void sout() {
        students.forEach((s) -> {
            s.getInfoStudent();
        });
        System.out.println("student counts = " + students.get(0).getCount());
    }

}
