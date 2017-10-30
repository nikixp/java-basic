package com.example.basics9;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PairTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getValueByKey(
                new Scanner(System.in).nextInt(), 
                new OrderedPair[]{
                    new OrderedPair(1, "one"),
                    new OrderedPair(2, "two"),
                    new OrderedPair(3, "three")
                })
        );
    }

    public static String getValueByKey(Integer key, OrderedPair[] pairs) {
        for (OrderedPair pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getVelue();
            }
        }
        return null;
    }

    public static String[] getValuesByKey(Integer key, OrderedPair[] pairs) {
        String[] values = new String[] {};
        for (OrderedPair pair : pairs) {
            if (pair.getKey().equals(key)) {
                return values;
            }
        }
        return null;
    }
}
