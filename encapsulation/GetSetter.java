package com.revature.encapsulation;

class Bank {
    private int money = 100; //cannot access data member because its private

    public int showBalance() { //getter=getMoney
        return money; //validate
    }

    public void deposit(int balance) { //setter=setMoney. Method
        this.money = money + balance; //validates
    }


}

public class GetSetter {
    public static void main(String[] args) {
        Bank obj = new Bank();
        System.out.println(obj.showBalance());
        obj.deposit(500);
        System.out.println(obj.showBalance());
    }
}
