package com.revature.ExerciseCollection;

import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("First");
        l_list.add("Second");
        l_list.add("Third");
        l_list.add("Forth");
        l_list.add("Fifth");
        l_list.add("Last");

        // print the list
        System.out.println("The linked list: " + l_list);
    }
}

//1. Write a Java program to append the specified element to the end of a linked list.