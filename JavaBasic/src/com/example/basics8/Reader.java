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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Reader {

    public static void main(String[] args) {

        String fileName = "‪‪C:\\Users\\Student\\Desktop\\datafile.txt";
        try {
            readFile(new File(fileName));
        } catch (Exception ex) {
            System.err.println("Logger:");
            Logger.getLogger(Reader.class.getName()).log(Level.WARNING, "nema fail s takova ime bee", ex);

            System.err.println("Stack trace:");
            ex.printStackTrace();

            System.err.println("IOException:");
            System.err.println(ex);
        }

    }

    private static void readFile(File file) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String tmp = null;
        while ((tmp = bufferedReader.readLine()) != null) {
            System.out.println("tmp: " + tmp);
        }

    }

}
