package com.meritamerica.assignment1;
import com.meritamerica.assignment1.CheckingAccount;


public class AccountHolder {
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	CheckingAccount chk;
	SavingsAccount sav;
	AccountHolder(){}
	AccountHolder(String firstName, String middleName, String lastName, String ssn, 
					double checkingAccountOpeningBalance, double savingsAccountOpeningBalance)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	} 
	
	String getFirstName()
	{
		return firstName;
	}
	
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
	
	public String toString()
	{
		String output = ("Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName()
					    +"\nSSN: " + getSSN()
					    + chk.toString());
						// this is where the Savings account ".toString" will go
					    // + sav.toString());
		return output;
	}
	
	
}