package com.meritamerica.assignment1;

public class AccountHolder {

	// Variable
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

//Constructor Blueprint
	public AccountHolder() {
	}

//Special Constructor
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);

	}
//Getter & Setter

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

	public String getSsn() {
		return ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	@Override
	public String toString() {
		return "AccountHolder [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", ssn=" + ssn + ", checkingAccount=" + checkingAccount + ", savingsAccount=" + savingsAccount + "]";
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

}