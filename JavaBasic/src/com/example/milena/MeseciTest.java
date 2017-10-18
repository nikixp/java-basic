/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.milena;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MeseciTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first month (1-12): ");
        int firstMonth = input.nextInt();
        System.out.println("Enter second month (1-12): ");
        int secondMonth = input.nextInt();

        sayPeriod(firstMonth, secondMonth);
        input.close();

    }

    private static void sayPeriod(int startMonth, int endMonth) {
        int period = endMonth - startMonth;
        if (period < 0) {
            //fix negative distance
            period = period + 12;
        }
        System.out.println("distance is " + period);

        sayMonth(startMonth);
        System.out.print(" to ");
        sayMonth(endMonth);
        System.out.print(".");

    }

    private static void sayMonth(int month) {
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;

        }

    }
}
