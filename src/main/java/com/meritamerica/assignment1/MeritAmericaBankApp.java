package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args)
	{
		//these are the instructions in order for the MeritAmericaBankApp requirements, just needs the savings account implemented
			
		AccountHolder account = new AccountHolder("Bradley", "T", "Thornton", "123-45-6789", 100, 1000);
		System.out.print(account.toString());
		account.chk.deposit(500);
		account.sav.withdraw(800);
		System.out.println(account.chk.toString());
		System.out.println(account.sav.toString());
		AccountHolder account2 = new AccountHolder("Ernest", "Gary", "Gygax", "123-45-6789", 200, 500);
		account2.chk.deposit(-500);
		account2.sav.withdraw(600);
		System.out.print(account2.toString());
		
	}
	
}