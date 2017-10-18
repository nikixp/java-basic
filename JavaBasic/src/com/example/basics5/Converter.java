package com.example.basics5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Converter {

    public Converter() {
        
    }

    public int reverter(int input) {
        int last_digit, reversedNum = 0;
        
        boolean firstDigit = true;
        while (input != 0) {
            last_digit = input % 10;
            if (last_digit > 0 || firstDigit == false) {
                reversedNum = reversedNum * 10 + last_digit;
            }
            input = input / 10;
            firstDigit = false;
        }
        
        return reversedNum;
    }

    public void getLastNumber(int number) {
        printNumberName(lastDigit(number));
    }

    public static int lastDigit(int d) {
        return Math.abs(d % 10);
    }

    public void printNumberName(int number) {
        switch (number) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 0:
                System.out.print("Zero");
                break;
        }
    }

}
