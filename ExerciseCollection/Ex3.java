package com.revature.ExerciseCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex3 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Hampshire");
        l_list.add("Breaking");
        l_list.add("Bad");
        l_list.add("White");
        l_list.add("Pink");
// set Iterator at specified index
        Iterator p = l_list.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position