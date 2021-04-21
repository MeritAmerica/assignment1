package com.meritamerica.assignment1;
	
	public class AccountHolder {	
	
	/** Data fields */
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	
	public AccountHolder() { // no-args constructor
		this.firstName = "";
		this.middleName  = "";
		this.lastName  = "";
		this.checkingAccountOpeningBalance = 0;
		this.savingsAccountOpeningBalance = 0;
		toString();
	}	
	
	public AccountHolder(String firstName, String middleName,  // parameterized constructor
		String lastName, String ssn, double checkingAccountOpeningBalance,
			double savingsAccountOpeningBalance) {
		
				this.firstName = firstName;
				this.middleName  = middleName;
				this.lastName  = lastName;
				this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
				this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;				
				toString();
	}	
	
	/** Getters and setters */
	public String getfirstName() {
		return this.firstName;		
	}	
	
	private void setFirstName(String firstName) {
		 this.firstName = firstName;
	}
	
	private String getMiddleName() {
		return middleName;
	}
	
	private void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	private String getLastName() {
		return lastName;
	}
	
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	private String getSSN() {
		return ssn;
	}
	
	private void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString() {
		return firstName + " " + middleName + " " + lastName 
				+ "\n" + checkingAccountOpeningBalance 
				+ "\n" + savingsAccountOpeningBalance;
		
	}

}