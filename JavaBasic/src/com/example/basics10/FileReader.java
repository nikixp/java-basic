package com.example.basics10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class FileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //task1();
        task2();
    }

    private static void task1() throws FileNotFoundException, IOException {
        File file = new File(FileReader.class.getResource("text.txt").getFile());
        if (file.exists()) {

            int line = 1;
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
                    String tmp;
                    while ((tmp = bufferedReader.readLine()) != null) {
                        if (line % 2 != 0) {
                            System.out.println("line " + line + " :" + tmp);
                        }
                        line++;
                    }
                }
            }
        } else {
            System.out.println("inputFile does not exist...");
        }
    }

    private static void task2() throws IOException {
        File textFile = new File("C:\\Files\\text.txt");
        File wordsFile = new File("C:\\Files\\words.txt");

        FileStreamReader fsr = new FileStreamReader();
        fsr.readTextFile(textFile, wordsFile);

        File resultFile = new File("C:\\Files\\result.txt");
        if (!resultFile.exists()) {
            resultFile.createNewFile();
        }

        fsr.saveResult(resultFile);

    }
}
