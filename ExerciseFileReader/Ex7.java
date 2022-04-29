package com.revature.Day12.Exercises;

import java.io.*;

public class Ex7 {
    public static void main(String[] args) {
        BufferedReader br = null;
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("db/abc.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
//7. Write a Java program to read first 3 lines from a file