package com.meritamerica.assignment1;

public class AccountHolder {
	
	public AccountHolder() {
		
	}
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	public String getFirstName() {
		return firstName;
	} 
	
	public void setFirstName(String firstName) {
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
	
	public CheckingAccount getCheckingAccount(){
		return checkingAccount;
	}
	
	public SavingsAccount getSavingsAccount(){
		return savingsAccount;
	}
	
	@Override
	public String toString() {
			return "1.  Name: " + firstName + " " + middleName + " " + lastName + "\r\n" 
			+ "2.  SSN: " + ssn + "\r\n" 
			+ "3.  Checking Account Balance: $" + checkingAccount.getBalance() + "\r\n"
			+ "4.  Checking Account Interest Rate: " + checkingAccount.withBigDecimal() + "\r\n"
			+ "5.  Checking Account Balance in 3 years: $" + checkingAccount.futureValue(3) + "\r\n"
			+ "6.  Savings Account Balance: $" + savingsAccount.getBalance() + "\r\n"
			+ "7.  Savings Account Interest Rate: " + savingsAccount.getInterestRate() + "\r\n"
			+ "8.  Savings Account Balance in 3 years: $" + savingsAccount.futureValue(3) + "\r\n";
	}
	
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	CheckingAccount checkingAccount;
	SavingsAccount savingsAccount;
	
	
}