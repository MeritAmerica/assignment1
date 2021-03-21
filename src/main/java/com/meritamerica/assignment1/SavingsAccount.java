package com.meritamerica.assignment1;

public class SavingsAccount extends AccountHolder 
{
	/*INSTANCE VARIABLES*/
	private double openingBalance;
	private double currentBalance;
	private double interestRate =.01;
	
	SavingsAccount() {}
	
	SavingsAccount(double openingBalance)
	{
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
	}
	
	/*GETTERS*/
	double getBalance() 
	{		 
		return openingBalance;
	}
	 	 
	double getInterestRate() 
	{		 
		return interestRate;
	}
	 
	boolean withdraw(double amount) 
	{	
		if(currentBalance >= amount) 
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
			currentBalance += amount;
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
		return "\nSavings Account Balance: " + getBalance() +
				"\nSavings Account Interest Rate: " + String.format("%.2f", getInterestRate()) +
				"\nSavings Account Balance in 3 Years: " + String.format("%.2f", futureValue(3));  			
	}
}