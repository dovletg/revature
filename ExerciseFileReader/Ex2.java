package com.revature.Day12.Exercises;

import java.io.File;


public class Ex2 {
    public static void main(String[] args) {

        File file = new File("db");

        File[] fileList = file.listFiles((d,f)-> f.toLowerCase().endsWith(".txt"));
        // Listing all the included files
        for(File f : fileList) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
//2. Write a Java program to get specific files by extensions from a specified folder.