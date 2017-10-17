package com.example.basics2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int matrix[][] = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("enter element [" + i + "][" + j + "]");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        int maxI = 0;
        int maxJ = 0;
        int maxSum = 0;
        int tempSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tempSum += matrix[i][j];
                if (maxSum < tempSum) {
                    maxI = i;
                    maxSum = tempSum;
                }
                System.out.println("maxSum=" + maxSum);
            }
            System.out.println("maxI=" + maxI);

        }

    }

}
