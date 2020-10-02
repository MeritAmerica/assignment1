package com.meritamerica.assignment1;

public class CheckingAccount {
	
	double checkingBalance;
	
	public CheckingAccount(double openingBalance){
		checkingBalance = openingBalance;
	}
	
	double getBalance() 
	{
		double balance = checkingBalance;
		return balance;
	}
	
	double getInterestRate() 
	{
		double rate = 2;
		return rate;
	}
	
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
		double FV = checkingBalance * Math.pow(1.01, years);
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