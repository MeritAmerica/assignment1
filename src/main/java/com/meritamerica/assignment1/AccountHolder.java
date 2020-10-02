package com.meritamerica.assignment1;



public class AccountHolder {
	
	// list of variables needed for the program
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	CheckingAccount chk;
	SavingsAccount sav;
	AccountHolder(){}
	// account holder initializes all of our initial given values, like name and account details
	AccountHolder(String firstName, String middleName, String lastName, String ssn, 
					double checkingAccountOpeningBalance, double savingsAccountOpeningBalance)
	{
		//this.(variable) refers to the variable names outside of the current scope
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		chk.checkingBalance = this.checkingAccountOpeningBalance;
		//this is where the savings account balance would be move to SavingsAccount
		//sav.savingBalance = this.savingsAccountOpeningBalance;

	} 
	// finds our firstName value and returns it, so on for middle and last name
	String getFirstName()
	{
		return firstName;
	}
	//changes our firstName value if so desired, so on for middle and last name
	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	String getMiddleName()
	{
		return middleName;
	}
	
	void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	String getLastName()
	{
		return lastName;
	}
	
	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	String getSSN() 
	{
		return ssn;
	}
	
	void setSSN(String ssn)
	{
		this.ssn = ssn;
	}
	
	CheckingAccount getCheckingAccount() {
		return chk;
	}
	
	SavingsAccount getSavingsAccount()
	{
		return sav;
	}
	
	//prints all of our data in a formatted table, with \n moving the text down a line for readability
	public String toString()
	{
		String output = ("Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName()
					    +"\nSSN: " + getSSN()
					    + "\n" + getCheckingAccount().toString());
						// this is where the Savings account ".toString" will go
					    //+ "\n" + getSavingsAccount().toString());
		return output;
	}
	
	
}