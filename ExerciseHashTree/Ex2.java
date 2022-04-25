package com.revature.Day9.ExerciseHashTree;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> set = new HashSet<String>();
        // use add() method to add values in the hash set
        set.add("Tesla");
        set.add("BMW");
        set.add("Mers");
        set.add("Toyota");
        set.add("Nissan");
        set.add("Lincoln");

        // set Iterator
        Iterator<String> p = set.iterator();
        // Iterate the hash set
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
//2. Write a Java program to iterate through all elements in a hash list
