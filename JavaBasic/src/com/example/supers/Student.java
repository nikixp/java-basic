package com.example.supers;

import java.util.Arrays;


/**
 *
 * @author Student
 */
public class Student extends Human {

    private Integer[] evaluation;

    public Student(String firstName, String lastName, Integer...evaluation) {
        super(firstName, lastName);
        this.evaluation = evaluation;
    }

    public Integer[] getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Integer[] evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Student{" + "evaluation=" + Arrays.toString(evaluation) + "} " + super.toString();
    }
    
    public Double getStudentEvaluation(){
        int count = 0;
        int sum = 0;
        for(Integer i : evaluation){
            sum += i;
            count ++;
        }
        return (double) sum/count;
    }
    
    
    
}
