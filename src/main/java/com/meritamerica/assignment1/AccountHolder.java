package com.meritamerica.assignment1;
import java.text.DecimalFormat;

public class AccountHolder {

    // Variables of Class
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	public SavingsAccount savingsAccount = new SavingsAccount();
	public CheckingAccount checkingAccount = new CheckingAccount();

	// Constructors
    public AccountHolder() {
        this.firstName = "John";
        this.middleName = "M";
        this.lastName = "Doe";
        this.ssn = "n/a";
    }

    public AccountHolder(String fn, String mn, String ln, String sn, double checkB, double savingB){
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
        this.ssn = sn;
        this.checkingAccount.deposit(checkB);
        this.savingsAccount.deposit(savingB);
    }

    // Setters and Getters
    public void setFirstName(String fn){
        this.firstName = fn;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setMiddleName(String mn){
        this.middleName = mn;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public void setLastName(String ln){
        this.lastName = ln;
    }

    public String getLastname(){
        return this.lastName;
    }

    public void setSSN(String sn){
        this.ssn = sn;
    }

    public String getSSN(){
        return this.ssn;
    }

    // Methods
    public CheckingAccount getCheckingAccount(){
        return this.checkingAccount;
    }

    public SavingsAccount getSavingsAccount(){
        return this.savingsAccount;
    }

    public String toString(){
        DecimalFormat format = new DecimalFormat("##.00");
        return "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n"
                + "SSN: " + this.ssn
                + this.checkingAccount
                + this.savingsAccount + "\n";
    }




}