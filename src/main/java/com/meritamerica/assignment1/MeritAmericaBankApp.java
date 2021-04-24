package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		AccountHolder firstCustomer = new AccountHolder("Al", "Likes", "Coding", "123456789", 100.00, 1000.00);
		System.out.println(firstCustomer.toString());
		firstCustomer.checkingAccount.deposit(500.0);
		System.out.println("Your new balance is: " + firstCustomer.checkingAccount.getBalance());
		firstCustomer.savingsAccount.withdraw(800.0);
		System.out.println("Your new balance is: " + firstCustomer.savingsAccount.getBalance());
		System.out.println(firstCustomer.checkingAccount.toString());
		System.out.println(firstCustomer.savingsAccount.toString());
		AccountHolder secondCustomer = new AccountHolder("Katie", "Codes", "Too", "987654321", 200.00, 500.00);
		secondCustomer.checkingAccount.deposit(-500.0);
		secondCustomer.savingsAccount.withdraw(600.0);
		System.out.println(secondCustomer.toString());
	}
}