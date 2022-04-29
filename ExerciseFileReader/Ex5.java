package com.revature.Day12.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) throws IOException {

        {
            /* Enter data using BufferReader */
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("my age is: ");

            // Reading data using readLine
            String name = reader.readLine();
            System.out.println("your age is: ");
            // Printing the read line
            System.out.println(name);
        }
    }
}
//5. Write Java program to read input from java console.