package com.example.basics10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class FileStreamReader {

    private static final String DEFAULT_ENCODING = "windows-1251";

    public List<String> resultFileLines = new ArrayList<>();

    public FileStreamReader() {
    }

    public void readTextFile(File textFile, File wordsFile) throws FileNotFoundException, IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(wordsFile), DEFAULT_ENCODING))) {
            String tmp;
            while ((tmp = bufferedReader.readLine()) != null) {
                int count = findWords(tmp, textFile);
                resultFileLines.add("word " + tmp + ", count " + count);
            }
        }

    }

    public int findWords(String word, File textFile) throws FileNotFoundException, IOException {
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(textFile), DEFAULT_ENCODING))) {
            String tmp;
            while ((tmp = bufferedReader.readLine()) != null) {
                String[] split = tmp.split("[ ...,-]");
                for (String s : split) {
                    if (s.equals(word)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void saveResult(File resultFile) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultFile))) {
            for (String s : resultFileLines) {
                bw.write(s);
                bw.newLine();
            }
        }
        System.out.println("result is saved into " + resultFile);
    }

    public List<String> getResultFileLines() {
        return resultFileLines;
    }

}
