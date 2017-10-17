package com.example.basics3;

import com.sun.media.jfxmedia.logging.Logger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaBasic3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new ClassA();
        
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter task...");
        switch (scanner.nextInt()) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3("C# is not C++ and PHP is not Delphi");
                break;
            case 4:
                task4();
                break;
        }
    }

    public static void task1() {
        System.out.println(new StringBuilder(new Scanner(System.in).nextLine()).reverse());

    }

    public static String reverse(String s) {
        char[] sCars = s.toCharArray();
        String s1 = "";
        for (int i = sCars.length - 1; i >= 0; i--) {
            s1 += sCars[i];
        }
        return s1;
    }

    public static void task2() {
        String s = " ain ainb inc din din ";
        String[] split = s.split("in");
        System.out.println(split.length - 1);

    }

    public static void task3(String text) {
        String[] split = text.split(" ");
        String r = "";
        for (int i = split.length - 1; i >= 0; i--) {
            r += split[i] + " ";
        }
        System.out.println(r);
    }

    public static void task4() {
        String sentence = "Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.";
        String badWords = "Java,Microsoft,JVM";
        String[] sWords = sentence.split("[ ,.]");

        String newSentence = "";
        for (String s : sWords) {
            String temp = checkWord(s, badWords.split(","));
            if (Objects.nonNull(temp)) {
                newSentence += temp + " ";
            }
            temp = "";
        }
        System.out.println(newSentence);
    }

    private static String checkWord(String word, String[] keys) {
        for (String s : keys) {
            if (word.equals(s)) {
                return null;
            }
        }
        return word;
    }

}
