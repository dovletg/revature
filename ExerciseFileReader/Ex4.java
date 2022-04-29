package com.revature.Day12.Exercises;

import java.io.File;

public class Ex4 {
    public static void main(String[] args) {
        File file = new File("db");
        System.out.println("db/abc.txt is file?"+file.isFile());
        System.out.println("db2/text.txt is directory?"+file.isDirectory());
    }
}
//4. Write a Java program to check if given pathname is a directory or a file.