package com.meritamerica.assignment1;


/* need to calc current balance based on withdraws and deposits
 * 
 * 
 * 
 */

public class CheckingAccount extends AccountHolder 
{
	/*INSTANCE VARIABLES*/
	private double openingBalance;
	private double currentBalance;
	private double interestRate = .0001;
	
	CheckingAccount() {}
	
	CheckingAccount(double openingBalance)
	{
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
	}
	
	/*GETTERS*/
	double getOpeningBalance()
	{
		return this.openingBalance;
	}	
	
	double getBalance() 
	{
		return currentBalance;
	}
	 	 
	double getInterestRate() 
	{		 
		return interestRate;
	}
	 	 
	boolean withdraw(double amount) 
	{	
		if(this.currentBalance >= amount) 
		{
			currentBalance -= amount;
			return true;
		}
		return false;
	}
			 
	boolean deposit(double amount)
	{	
		if(amount > 0) 
		{
			this.currentBalance += amount;
			return true;
		}
		return false;
	}
	  
	double futureValue(int years) 
	{	 	
		return currentBalance * Math.pow((1 + interestRate), (double)years);
	}
	
	public String toString()
	{
		return "\nChecking Account Balance: " + getBalance() +
				"\nChecking Account Interest Rate: " + String.format("%.4f", getInterestRate()) +
				"\nChecking Account Balance in 3 Years: " + String.format("%.2f", futureValue(3));  
			
	}
}

