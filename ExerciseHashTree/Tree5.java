package com.revature.Day9.ExerciseHashTree;

import java.util.TreeSet;

public class Tree5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("First");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("YellowLast");
        System.out.println("Tree set: ");
        System.out.println(set);

        // Find first element of the tree set
        Object first_element = set.first();
        System.out.println("First Element is: "+first_element);

        // Find last element of the tree set
        Object last_element = set.last();
        System.out.println("Last Element is: "+last_element);
    }
}
