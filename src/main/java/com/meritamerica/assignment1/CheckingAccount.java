package com.meritamerica.assignment1;

import java.math.*;
import java.lang.*;

public class CheckingAccount {
	
	private static final double INTEREST_RATE = 0.0001;
	
	public CheckingAccount(double openingBalance) {
		currentBalance = openingBalance;
	}
	
	public double getBalance() {
		return currentBalance;
	}
	
	public double getInterestRate() {
		return INTEREST_RATE;
	}
	
	public BigDecimal withBigDecimal() {
	    bigDecimal = new BigDecimal(INTEREST_RATE);
	    bigDecimal = bigDecimal.setScale(4, RoundingMode.HALF_UP);
	    return bigDecimal;
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
				+ "2. Checking Account Interest Rate: " + bigDecimal + "\r\n"
				+ "3. Checking Account Balance in 3 years: $" + fv;
	}
	

	private double currentBalance;
	public static double fv;
	BigDecimal bigDecimal;
	
}