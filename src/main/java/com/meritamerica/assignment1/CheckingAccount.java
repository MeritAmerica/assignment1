package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private static final double INTEREST_RATE = (double)0.0001;
	
	public CheckingAccount(double openingBalance) {
		currentBalance = openingBalance;
	}
	
	public double getBalance() {
		return currentBalance;
	}
	
	public double getInterestRate() {
		return INTEREST_RATE;
	}
	
	public boolean withdraw(double amount) {
		if (currentBalance >= amount) {
			currentBalance -= amount;
			return true;
		} else {
			System.out.println("Transaction Failed");
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			currentBalance += amount;
			return true;
		} else {
			System.out.println("Transaction Failed");
			return false;
		}
	}
	
	public double futureValue(int years) {
		fv = (currentBalance *(Math.pow((1+INTEREST_RATE), years)));
		fv = Math.round(fv * 100.0) /100.0;
		return fv;
	}
	
	public String toString() {
		return "1. Checking Account Balance: $" + currentBalance + "\r\n"
				+ "2. Checking Account Interest Rate: " + INTEREST_RATE + "\r\n"
				+ "3. Checking Account Balance in 3 years: $" + fv;
	}
	

	private double currentBalance;
	public static double fv;
	
}