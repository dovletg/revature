package com.revature.Day12.Exercises;

import java.io.File;

public class Ex1 {
    public static void main(String[] args) {
       // int count=0;
        File file = new File("db2");
        String[] fileList = file.list();
        for(String name:fileList){
           // count++;
            System.out.println(name);
        }
    }
}
//1.Write a Java program to get a list of all file/directory names from the given