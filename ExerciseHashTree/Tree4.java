package com.revature.Day9.ExerciseHashTree;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree4 {
    public static void main(String[] args) {
        // create an empty tree set
        TreeSet<String> set = new TreeSet<String>();
        // use add() method to add values in the tree set
        set.add("Book");
        set.add("Pen");
        set.add("Notebook");
        set.add("Pencil");
        set.add("Ruler");
        // print original list
        System.out.println("Original tree set:" + set);
        Iterator it = set.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
// 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
