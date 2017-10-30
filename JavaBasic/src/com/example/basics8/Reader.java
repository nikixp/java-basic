/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Reader {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter file location: ");
        String fileName = input.nextLine();

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("filename " + fileName + " does not exist");
            return;
        }

        try {
            readFile(file);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    private static void readFile(File file) throws FileNotFoundException, IOException {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
                String tmp;
                while ((tmp = bufferedReader.readLine()) != null) {
                    System.out.println(tmp);
                }
            }
        }
    }

}
