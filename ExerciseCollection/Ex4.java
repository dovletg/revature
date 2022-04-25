package com.revature.ExerciseCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex4 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Hampshire");
        l_list.add("Die");
        l_list.add("Or");
        l_list.add("Free");
        l_list.add("Live");

        // print original list
        System.out.println("Original linked list:" + l_list);

        Iterator it = l_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
// 4. Write a Java program to iterate a linked list in reverse order.