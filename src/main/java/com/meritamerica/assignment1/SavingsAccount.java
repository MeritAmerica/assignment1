package com.meritamerica.assignment1;

public class SavingsAccount {
	//Variable
	private double balance;
	private double interestRate = 0.01;
	private double futureValue;

//Constructor
	public SavingsAccount() {
		
	}

	//Special Constructor

public SavingsAccount(double balance) {
	super();
	this.balance = balance;
}

public double getBalance() {
	return balance;
}

public double getInterestRate() {
	return interestRate;
}
	
	public boolean withdraw(double amount) {
		if ( amount<=balance && !(amount<0)) {
			balance-=amount;
			return true;
			
			
		}else
			return false;
	}
	
	public boolean deposit(double amount) {
		if (amount>0) {
		balance+=amount;
		return true;
		
	}else
		return false;

	
	
	}
	
	public double futureValue(int years) {
		double interest=1.01;
		return Math.pow(interest, years)*this.balance;
		
		
				
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureValue=" + futureValue
				+ "]";
	}
	
	
	
}

