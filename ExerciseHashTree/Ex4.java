package com.revature.Day9.ExerciseHashTree;

import java.util.HashSet;

public class Ex4 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> set = new HashSet<String>();
        // use add() method to add values in the hash set
        set.add("Book");
        set.add("Pen");
        set.add("Notebook");
        set.add("Pencil");
        set.add("Sharpner");
        set.add("Ruler");
        System.out.println("Original Hash Set: " + set);
        // Remove all elements
        set.removeAll(set);
        System.out.println("Hash Set after removing all the elements "+set);
    }
}
//4. Write a Java program to empty a hash set.
