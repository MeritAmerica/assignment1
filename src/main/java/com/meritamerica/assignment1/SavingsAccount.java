package com.meritamerica.assignment1;

public class SavingsAccount {
	
	double savingsBalance;
	private static final double rate = .01;
	
	SavingsAccount(double openingBalance)
	{
		this.savingsBalance = openingBalance;
	}
	
	double getBalance()
	{
		return savingsBalance;
	}
	
	double getInterestRate()
	{
		return rate;
	}
	
	boolean withdraw(double amount)
	{
		if (amount > savingsBalance || amount < 0)
		{
			System.out.println("Invalid Amount");
			return false;
		}
		else
		{
			System.out.println("Approved amount!");
			savingsBalance -= amount;
			return true;
		}
	}
	
	boolean deposit(double amount)
	{
		if (amount < 0)
		{
			System.out.println("Invalid Amount");
			return false;
		}
		else
		{
			System.out.println("Approved amount!");
			savingsBalance += amount;
			return true;
		}
	}
	
	double futureValue(int years)
	{
		double FV = savingsBalance * Math.pow((1+rate), years);
		return FV;
	}
	
	public String toString()
	{
		String output = ("Savings Account Balance: " + getBalance()
						+"\nSavings Account Interest Rate: " + getInterestRate() 
						+"\nSavings Account Balance in 3 Years: " + futureValue(3) + "\n\n");
		return output;
	}
}