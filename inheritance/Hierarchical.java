package com.revature.inheritance;

//1 parent and 2 child

class Animal{
    void eating(){
        System.out.println("Eating...");
    }
}

class cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        cat obj1 = new cat();
        dog obj2 = new dog();
        obj1.eating();
        obj1.meow();
    }
}
