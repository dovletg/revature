package com.dovlet;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        BankingDao dao = BankingDaoFactory.getBankingDao();

        Scanner scanner = new Scanner(System.in);
        //private static Banking bankingServices;
        //BankingServices = new bankingServices();

        boolean flag = true;

        while (flag){
            System.out.println("=================================");
            System.out.println("Select from the options below");
            System.out.println("---------------------------------");
            System.out.println("PRESS 1: Add User");       //done
            System.out.println("PRESS 2: View Balance");    //done
            System.out.println("PRESS 3: To Deposit");      //done
            System.out.println("PRESS 4: To Withdraw");     //done
            System.out.println("PRESS 5: Get All Users");  //done
            System.out.println("PRESS 6: Exit");           //done
            System.out.println("=================================");

            int input = scanner.nextInt();
            switch (input){
                case 1: {
                    // add
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Amount: ");
                    int balance = Integer.parseInt(scanner.next());
                    Banking newBanking = new Banking();
                    newBanking.setName(name);
                    newBanking.setBalance(balance);
                    dao.addBanking(newBanking);
                    break;
                }
                case 2: {    // check with trainer!
                    // view
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    int balance = dao.getBalanceById(id);
                    System.out.println("Your balance is " + balance);
                    break;
                }

                case 3: {
                    // deposit
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    int deposit = scanner.nextInt();;
                    Banking banking = new Banking();
                    banking.setId(id);
                    int balance = dao.getBalanceById(id);
                    banking.setBalance(deposit + balance);
                    dao.updateBanking(banking);
                    break;
                }
                case 4: {
                    // withdraw
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    int withdraw = scanner.nextInt();;
                    Banking banking = new Banking();
                    banking.setId(id);
                    int balance = dao.getBalanceById(id);
                    banking.setBalance(balance - withdraw);
                    dao.updateBanking(banking);
                    break;
                }
                case 5: {
                    // get all
                    List<Banking> users = dao.getBanking();
                    for(Banking user: users){
                        System.out.println(user);
                    }
                    break;
                }
                case 6: {
                    // exit
                    System.out.println("Thank you");
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                }
                default:
                    System.out.println("Choose between 1-6");
            }
        }
    }
}
