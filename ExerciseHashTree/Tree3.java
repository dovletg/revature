package com.revature.Day9.ExerciseHashTree;

import java.util.TreeSet;

public class Tree3 {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Earth");
        set1.add("Mars");
        set1.add("Jupiter");
        System.out.println("Tree set1: "+set1);
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Saturn");
        set2.add("Moon");
        set2.add("Sun");
        System.out.println("Tree set2: "+set2);
        // adding treetwo to treeone
        set1.addAll(set2);
        System.out.println("Tree set1: "+set1);
    }
}
// 3.Write a Java program to add all the elements of a specified tree set to another tree set.
