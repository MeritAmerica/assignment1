package com.meritamerica.assignment1;
import java.text.DecimalFormat;

public class SavingsAccount {

    // Variables
    private double balance;
    private static double interest = 0.01;

    //Constructors
    public SavingsAccount(){
        this.balance = 0.0;
    }

    public SavingsAccount(double savingB){
        this.balance = savingB;
    }

    //Getters and Setters
    public double getBalance(){
        return this.balance;
    }

    public double getInterestRate(){
        return interest;
    }

    //Methods
    public double futureValue(int years){
        double pv = this.getBalance();
        double fv = pv * (Math.pow((1 + this.getInterestRate()), years));
        return fv;
    }

    public boolean withdraw(double amount){
        if (amount < 0){
            System.out.println("Unable to withdraw a negative amount. Try again.");
            return false;
        } else {
            if((this.getBalance() - amount) < 0){
                System.out.println("Not enough funds in the account.");
                return false;
            } else {
                double newB = this.getBalance() - amount;
                this.balance = newB;
                return true;
            }
        }
    }

    public boolean deposit(double amount){
        if(amount <= 0){
            System.out.println("Unable to deposit negative funds. Try again.");
            return false;
        } else {
            this.balance = this.getBalance() + amount;
            return true;
        }
    }

    public String toString(){
        DecimalFormat format = new DecimalFormat("##.00");
        return "Saving Account Balance: $" + format.format(this.getBalance()) + "\n"
                + "Saving Account Interest Rate: " + this.getInterestRate() + "\n"
                + "Saving Account Balance in 3 years: " + format.format(this.futureValue(3)) + "\n";
    }
	
}