package com.revature.Day9.ExerciseHashTree;

import java.util.HashSet;

public class Ex1 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Tomato");
        h_set.add("Pepper");
        h_set.add("Grape");
        h_set.add("Onion");
        h_set.add("Cherry");
        h_set.add("Banana");

        // print the hash set
        System.out.println("The Hash Set: " + h_set);
    }
}
//1. Write a Java program to append the specified element to the end of a hash set.