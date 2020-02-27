package com.meritamerica.assignment1;


public class AccountHolder {

	 String firstName;
	 String middleName;
	 String lastName;
	 String ssn;
	 double checkingAccountOpeningBalance = 0;
	 double savingsAccountOpeningBalance = 0;
	
	 public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
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
	 
	 public void setFirstname(String name) {
		 this.firstName = name;
		 
	 }
	 
	 public String getMiddleName() {
		 return middleName;
	 }
		
	 public void setMiddleName(String midName ) {
		 this.middleName = midName;
	 }
	 
	 public String getSSN() {
		 return ssn;
	 }
	 
	 public void setSSN(String SSN) {
		 this.ssn = SSN;
	 }
	 
	 public double getCheckingAccount(double accountBalance) {
		 this.checkingAccountOpeningBalance = accountBalance;
		 return accountBalance;
	 }
	 
	 public String toString() {
		 return (
				 "Name: " + firstName + " " + middleName + " " + lastName + 
				 "\nSSN: " + ssn + 
				 "\nChecking Account Balance: " + checkingAccountOpeningBalance +
				 "\nChecking Account Interest Rate: " + 
				 "\nChecking Account Balance in 3 years: " + 
				 "\nSavings Account Balance: " + savingsAccountOpeningBalance +
				 "\nSavings Account Interest Rate: " + 
				 "\nSavings Account Balance in 3 years: " 
				 );
	 }
	

}
