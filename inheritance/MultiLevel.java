package com.revature.inheritance;

//multilevel inheritance

class parents1{
    int eyes = 2;
    int ears = 2;
}

class child1 extends parents1{
    int nose=1;
    void display(){
        System.out.println("eyes:"+ eyes + " ears:" + ears);
    }
}

class grand_child extends child1{
    void mention(){
        System.out.println("Nose:"+nose+ " ears:"+ears);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        grand_child obj = new grand_child();
        obj.mention();
    }
}

