package com.meritamerica.assignment1;

public class CheckingAccount {
	
	
	//Variable
	private double balance;
	private double interestRate = 0.0001;
	private double futureValue;
	
	// Constructor
public CheckingAccount() {


}//Special Construction
public CheckingAccount(double OpeningBalance) {
	this.balance = OpeningBalance;
}
public double getBalance() {
	return balance;
}
public double getInterestRate() {
	return interestRate;
}
public double getFutureValue() {
	return futureValue;
}
public boolean withdraw(double amount) {
	if (amount <= balance && !(amount <0)) {
		balance -= amount; 
		return true;
	
	}else
		return false;

}

public boolean deposit(double amount) {
	if (amount > 0) {
	balance +=amount;
	return true;
	}else
		return false;
	
}

public double futureValue(int years) {
	double interest=1.0001;
	double p= 100.0;
	return Math.pow(interest, years)*p;
	
	
			
}
@Override
public String toString() {
	return "CheckingAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureValue=" + futureValue
			+ "]";
}






	
}