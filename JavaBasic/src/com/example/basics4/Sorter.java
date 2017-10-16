package com.example.basics4;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Student
 */
public class Sorter {

    private int[] numbers;

    public Sorter(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort(int[] numbers) {
        this.numbers = numbers;
        sort();
    }

    public void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }
            int smallerNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
            System.out.println(Arrays.toString(numbers));
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

}
