package com.revature.ExerciseCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex2 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("A");
        l_list.add("B");
        l_list.add("C");
        l_list.add("D");
        l_list.add("E");
// set Iterator at specified index
        Iterator p = l_list.listIterator(0);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}

// 2. Write a Java program to iterate through all elements in a linked list.
