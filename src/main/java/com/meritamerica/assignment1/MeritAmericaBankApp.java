package com.meritamerica.assignment1;

public class MeritAmericaBankApp
{	
	
	/*INSTANCE VARIABLES*/
	
	/*METHODS*/	
	public static void main(String[] args)
	{
		
		AccountHolder accountHolder = new AccountHolder("The", "Super", "Dave", "111-11-1111", 100, 1000);			// instantiate account holder with 100 in checking, 1000 in savings
		accountHolder.toString();																					// display info
		accountHolder.getCheckingAccount().deposit(500);															// deposit 500 into checking
		accountHolder.getSavingsAccount().withdraw(800);															// withdraw 800 
		accountHolder.getCheckingAccount().toString();																// display checking account info
		accountHolder.getSavingsAccount().toString();																// display savings account info
		AccountHolder accountHolderTwo = new AccountHolder("Catalina", "Wine", "Mixer", "222-22-2222", 200, 500);	// instantiate second account holder, 200 in checking and 500 in savings
		accountHolderTwo.getCheckingAccount().deposit(-500);														// deposit -500 into checking
		accountHolderTwo.getSavingsAccount().withdraw(600);															// withdraw 600 from savings
		accountHolderTwo.toString();
																						
		
		/* TESTS
		AccountHolder accountHolder = new AccountHolder("The", "Super", "Dave", "111-11-1111", 100, 1000);			// instantiate account holder with 100 in checking, 1000 in savings
		System.out.println(accountHolder.toString());																// display info
		System.out.println(accountHolder.getCheckingAccount().deposit(500));										// deposit 500 into checking
		System.out.println(accountHolder.getSavingsAccount().withdraw(800));										// withdraw 800 
		System.out.println(accountHolder.getCheckingAccount().toString());											// display checking account info
		System.out.println(accountHolder.getSavingsAccount().toString());											// display savings account info
		AccountHolder accountHolderTwo = new AccountHolder("Catalina", "Wine", "Mixer", "222-22-2222", 200, 500);	// instantiate second account holder, 200 in checking and 500 in savings
		System.out.println(accountHolderTwo.getCheckingAccount().deposit(-500));									// deposit -500 into checking
		System.out.println(accountHolderTwo.getSavingsAccount().withdraw(600));										// withdraw 600 from savings
		System.out.println(accountHolderTwo.toString());
		*/
	}		
}