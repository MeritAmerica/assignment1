package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void Main(String[] args) {
		
		//Create Account Holder1
		AccountHolder Cus1 = new AccountHolder("May", " ","Calhoun", "123456789", 100.0, 1000.0);
		System.out.println(Cus1 + " " + toString());
		
		//Account Holder1 Deposit CheckingAccount
		Cus1.getCheckingAccount().deposit(500.0);
		
		//Account Holder1 Withdraw SavingsAccount
		Cus1.getSavingsAccount().withdraw(800.0);
		
		System.out.println(Cus1.getCheckingAccount().toString());
		System.out.println(Cus1.getSavingsAccount().toString());
		
		
		AccountHolder Cus2 = new AccountHolder("Wilmer", " ","Ibarra", "123456789", 200.0, 500.0);
		System.out.println(Cus2 + " " + toString());
		
		//Account Holder2 Deposit CheckingAccount
		Cus2.getCheckingAccount().deposit(-500.0);
		
		//Account Holder2 Withdraw SavingsAccount
		Cus2.getSavingsAccount().withdraw(600.0);
		
		System.out.println(Cus2.toString());
		
			}
}
