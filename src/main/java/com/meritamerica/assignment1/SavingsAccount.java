package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private static final double INTEREST_RATE = 0.01;
	
	public SavingsAccount(double openingBalance) {
		currentBalance = openingBalance;
	}
	
	public double getBalance() {
		return currentBalance;
	}
	
	public double getInterestRate() {
		return INTEREST_RATE;
	}
	
	public boolean withdraw(double amount) {
		if (currentBalance >= 0) {
			currentBalance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			currentBalance += amount;
			return true;
		} else {
			return false;
		}
	}
	
	public double futureValue(int years) {
		fv = 100*(Math.pow((1+INTEREST_RATE), years));
		fv = Math.round(fv * 100.0) /100.0;
		return fv;
	}
	
	public String toString() {
		return "1.  Savings Account Balance: $" + currentBalance + "\r\n"
				+ "2. Savings Account Interest Rate: " + INTEREST_RATE + "\r\n"
				+ "3.  Savings Account Balance in 3 years: $" + fv;
	}
	
	private double currentBalance;
	public double fv;
	
}