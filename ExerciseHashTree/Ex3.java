package com.revature.Day9.ExerciseHashTree;

import java.util.HashSet;

public class Ex3 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> set = new HashSet<String>();
        // use add() method to add values in the hash set
        set.add("Earth");
        set.add("Mars");
        set.add("Jupiter");
        set.add("Saturn");
        set.add("Moon");
        set.add("Sun");
        System.out.println("Original Hash Set: " + set);
        System.out.println("Size of the Hash Set: " + set.size());
    }
}
//3.Write a Java program to get the number of elements in a hash set.
