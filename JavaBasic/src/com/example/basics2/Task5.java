/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("set count");
        int[] inputs = new int[scanner.nextInt()];
        System.out.println("set values");
        for (int i : inputs) {
            inputs[i] = scanner.nextInt();
        }
        System.out.println("set sum");
        int max = scanner.nextInt();

        int[] values = new int[0];
        int current = 0;

        for (int i = 0; i < inputs.length; i++) {
            current = getSum(inputs[i], max, inputs, i);
            if (current == max) {
                break;
            }
        }
        System.out.println(current);
    }

    public static int getSum(int current, int max, int[] inputs, int fromIndex) {
        if (current + inputs[fromIndex] <= max) {
            return current + inputs[fromIndex];
        } else {
            return current;
        }

        /*int sum = 0;
        for (int i = fromIndex; i < inputs.length; i++) {
            if (sum + inputs[i] <= max) {
                sum += inputs[i];
            }
        }
        return sum;*/
    }

}
