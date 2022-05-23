package com.dovlet;

// First step

public class Banking { //all properties I want to use
    private int id;
    private String name;
    private int balance;
    private double amount;

    // defult constructor
    public Banking(){

    }

    // parent class constructor
    public Banking(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // created getter and setter if required I can use
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //created tostring as well

    @Override
    public String toString() {
        return "Banking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
