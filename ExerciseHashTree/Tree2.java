package com.revature.Day9.ExerciseHashTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree2 {
    public static void main(String[] args) {
        // Create a empty tree set
        TreeSet<String> set = new TreeSet<String>();
        // use add() method to add values in the tree set
        set.add("Tesla");
        set.add("BMW");
        set.add("Mers");
        set.add("Toyota");
        set.add("Nissan");
        set.add("Lincoln");

        for (String element : set) {
            System.out.println(element);
        }
    }
}
//2. Write a Java program to iterate through all elements in a tree set.

