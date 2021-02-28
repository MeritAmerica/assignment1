package com.meritamerica.assignment1;

public class CheckingAccount extends AccountHolder 
{
	/*INSTANCE VARIABLES*/
	private double openingBalance;
	private int years;
	
	
	
	private double interestRate =.0001;
	
	

	
	
	/* Getters*/
	 private double getBalance() {
		 
		 
		 return openingBalance;
	 }
	 
	 
	 private double getInterestRate() {
		 
		 return interestRate;
	 }
	 
	 
	 boolean withdraw(double amount) {
		 
		 
		 return 
		 
		 
		 
	 }
 boolean deposit(double amount) {
		 
		 
		 return 
		 
		 
		 
	 }
	 
 
 double futureValue(int years) {
	 
	 
	 return 
	 
	 
	 
 }
	
 public String toString()
	{
		return "\nChecking Account Balance: " + getBalance() +
				"\nChecking Account Interest Rate: " + getInterestRate() +
				"\nChecking Account Balance in 3 Years" + futureValue(years);  
			
	}
}