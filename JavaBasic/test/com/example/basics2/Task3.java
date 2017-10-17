/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics2;

/**
 *
 * @author Student
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        System.out.println(getMaxElement(numbers));
    }

    private static int getMaxElement(int[] array) {
        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (temp == array[j]) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

}
