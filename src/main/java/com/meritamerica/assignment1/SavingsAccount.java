package com.meritamerica.assignment1;

public class SavingsAccount extends AccountHolder 
{
	/*INSTANCE VARIABLES*/
	private double openingBalance;
	private int years;

	
	
	private double interestRate =.01;
	
	

	
	
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
		return "\nSavings Account Balance: " + getBalance() +
				"\nSavings Account Interest Rate: " + getInterestRate() +
				"\nSavings Account Balance in 3 Years" + futureValue(years);  
			
	}
}