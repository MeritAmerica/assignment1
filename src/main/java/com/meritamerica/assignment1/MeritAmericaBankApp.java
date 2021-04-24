package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		AccountHolder firstCustomer = new AccountHolder("Al", "Middle", "Last", "123456789", 100.00, 100.00);
		System.out.println(firstCustomer.getFirstName());
		CheckingAccount account = new CheckingAccount();
		SavingsAccount savAccount = new SavingsAccount();
		
	}
}