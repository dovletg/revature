package com.revature.Day12.Exercises;

import java.io.File;

public class Ex3 {
    public static void main(String[] args) {
        File myFileDir = new File("db/abc.txt");
        if (myFileDir.exists())
        {
            System.out.println("The directory or file exists.\n");
        }
        else
        {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}
//3. Write a Java program to check if a file or directory specified by pathname exists or not.