package com.meritamerica.assignment1;

public class CheckingAccount{

	double balance = 0;
	double openingBalance = 0;
	double interestRate = 0.01;
	
	public CheckingAccount(double openingbalance) {
			
			this.balance = openingBalance;
	}
	
	public double getBalance() {
		
		return this.balance;
	
	}
	
	public double getInterestRate() {
		
		return interestRate;
	}
	
	public boolean withdraw(double amount) {
		if (balance <= 0) {
			System.out.println("Your balance is zero or below. Can't make withdrawal.");
			return false;
			
		} else if (balance > 0) {
			balance = balance - amount;
			
		}
		return true;
		
		
	}
	
	public boolean deposit(double amount) {
		
	}
	
	public double futureValue() {
		//Formula: FV = PV(1 + interestRate) ^ years;
		//double FV = balance * Math.pow(1.01, 3);
		
	}
	
	public String toString() {
		return (
					"Checking Account Balance: " + 
				   "\nChecking Account Interest Rate: " + 
					"\nChecking Account Balance in 3 Years: " 
				   );
	}
	
	
