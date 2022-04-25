package com.revature.ExerciseCollection;

import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("My");
        l_list.add("Is");
        l_list.add("Dovlet");
        l_list.add("Kossekov");
        l_list.add("Your?");
        System.out.println("Original linked list: ");
        System.out.println("Let add the Name String after the My String: " + l_list);
        l_list.add(1, "Name");
        // print the list
        System.out.println("The linked list:" + l_list);
    }
}
// 5. Write a Java program to insert the specified element at the specified position in the linked list.
