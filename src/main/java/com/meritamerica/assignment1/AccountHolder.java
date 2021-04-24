package com.meritamerica.assignment1;

public class AccountHolder {
	
	private void AccountHolder() {
		
	}
	private void AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
	
	public String getFirstName() {
		return firstName;
	} 
	
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	private CheckingAccount getCheckingAccount(){
		CheckingAccount checkingAccount = new CheckingAccount();
		return checkingAccount;
	}
	
	public SavingsAccount getSavingsAccount(){
		SavingsAccount savingsAccount = new SavingsAccount();
		return savingsAccount;
	}
	
	@Override
	public String toString() {
			return "1.  Name: " + firstName + middleName + lastName + "\r\n" 
			+ "2.  SSN: " + ssn + "\r\n" 
			+ "3.  Checking Account Balance: $ " + account.getBalance() + "\r\n"
			+ "4.  Checking Account Interest Rate: " + account.getInterestRate() + "\r\n"
			+ "5.  Checking Account Balance in 3 years: $ " + account.fv + "\r\n"
			+ "6.  Savings Account Balance: $ " + savAccount.getBalance() + "\r\n"
			+ "7.  Savings Account Interest Rate: " + savAccount.getInterestRate() + "\r\n"
			+ "8.  Savings Account Balance in 3 years: $ " + savAccount.fv + "\r\n";
	}
	
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	
	
}