package com.meritamerica.assignment1;

public class MeritAmericaBankApp {


    public static void main(String args[]){
        AccountHolder newAccount = new AccountHolder("Reuben", "E", "Pena", "123-45-4567", 100, 1000);
        System.out.print(newAccount);
        newAccount.checkingAccount.deposit(500);
        newAccount.savingsAccount.withdraw(800);
        System.out.println(newAccount.checkingAccount);
        System.out.println(newAccount.savingsAccount);
        AccountHolder newerAccount = new AccountHolder("Alicia", "L", "Gutierrez", "123-44-4567", 200, 500);
        newerAccount.checkingAccount.deposit(-500);
        newerAccount.savingsAccount.withdraw(600);
        System.out.println(newerAccount);
    }

}