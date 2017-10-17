/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class TaskSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] array = new int[n];
        for (int a : array) {
            a = scanner.nextInt();
        }

        Arrays.sort(array);
        int sum = 0;
        for(int i = n - k; i < array.length; i++){
            sum += array[i];
        }
        
        System.out.println(sum);

    }

}
