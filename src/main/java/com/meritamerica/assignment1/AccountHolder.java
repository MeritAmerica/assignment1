package com.meritamerica.assignment1;

/*
-create default constructor
-need to create/store first, middle, last name, SSN, checking/savings account
- 
 
 
*/

public class AccountHolder 
{
	/*INSTANCE VARIABLES*/
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
		
	/*METHODS*/
	AccountHolder() {}
	
	AccountHolder(
			String firstName,
			String middleName,
			String lastName,
			String ssn,
			double checkingAccountOpeningBalance,
			double savingsAccountOpeningBalance
			)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
	
	public String toString()
	{
		return "\nName: " + getFirstName() + " " + getMiddleName() + " " + getLastName() +
				"\nSSN: " + getSSN() +
				"\n" + getCheckingAccount() +
				"\n" + getSavingsAccount();
	}
		
	/*GETTERS*/
	String getFirstName()
	{
		return firstName;
	}
	
	String getMiddleName()
	{
		return middleName;
	}
	
	String getLastName()
	{
		return lastName;
	}
	
	String getSSN()
	{
		return ssn;
	}
	
	CheckingAccount getCheckingAccount()
	{
		return checkingAccount;
	}
	
	SavingsAccount getSavingsAccount()
	{
		return savingsAccount;
	}		
	
	/*SETTERS*/
	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	void setSSN(String ssn)
	{
		this.ssn = ssn;
	}
}