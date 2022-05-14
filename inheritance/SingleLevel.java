package com.revature.inheritance;

//single level inheritance. Parent to child

class parents{
    int eyes = 2;
    int ears = 2;
}

class child extends parents{
    void display(){
        System.out.println("eyes:"+ eyes + " ears:" + ears);
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
    }
}
