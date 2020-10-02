package com.meritamerica.assignment1;

public class CheckingAccount {
	
	double checkingBalance;
	//set as final because the rate is never to be changed
	private static final double rate = .0001;
	
	public CheckingAccount(double openingBalance){
		checkingBalance = openingBalance;
	}
	
	double getBalance() 
	{
		return checkingBalance;
	}
	
	double getInterestRate() 
	{
		return rate;
	}
	
	//checks if either taking more money then there is or inputting a negative value or 0
	boolean withdraw(double amount)
	{
		if (amount > checkingBalance || amount <= 0)
		{
			return false;
		}
		else
		{
			checkingBalance -= amount;
			return true;
		}
	}
	
	//checks if giving a negative value or 0
	boolean deposit(double amount)
	{
		if (amount <= 0)
		{
			return false;
		}
		else
		{
			checkingBalance += amount;
			return true;
		}
	}
	
	double  futureValue(int years)
	{
		double FV = checkingBalance * Math.pow((1+rate), years);
		return FV;
	}
	
	public String toString()
	{
		String output = ("Savings Account Balance: " + getBalance()
						+"\nSavings Account Interest Rate: " + getInterestRate() 
						+"\nSavings Account Balance in 3 Years: " + futureValue(3));
		return output;
		
	}
}