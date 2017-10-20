package com.example;

import com.example.supers.Student;
import com.example.supers.Worker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Student
 */
public class JavaBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student student = new Student("Ivan", "Ivanov", new Integer[]{5, 4, 6, 6, 4, 5});
        System.out.println("student evaluation is " + student.getStudentEvaluation());

        Worker worker = new Worker(40, 11.50, "Iwan", "Ivanov");
        System.out.println("worker salary is " + worker.getWorkerSalary());

        Student[] students = new Student[]{
            new Student("Mitko", "Tarikata", new Integer[]{3, 3, 3, 4, 3, 4}),
            new Student("Ivan", "Spqshtiq", new Integer[]{4, 2, 4, 3, 3, 4}),
            new Student("Nikolay", "Hristov", new Integer[]{6, 6, 6, 6, 6, 6}),
            new Student("Zdravko", "Zdraviq", new Integer[]{5, 4, 4, 3, 5, 6})
        };
        
        sortStudents(students);
        
        for(Student s :students){
            System.out.println(s.getStudentEvaluation());
        }

    }

    private static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int index = i;
            for (int j = i; j < students.length; j++) {
                if (students[j].getStudentEvaluation() < students[index].getStudentEvaluation()) {
                    index = j;
                }
            }
            Student temp = students[index];
            students[index] = students[i];
            students[i] = temp;
        }
    }
}
