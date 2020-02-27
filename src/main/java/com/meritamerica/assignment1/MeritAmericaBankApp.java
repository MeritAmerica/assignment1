package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Merit Bank");
		
		
			
				AccountHolder person1 = new AccountHolder("Jill", "Joy", "Smith", "7894563214", 100, 1000);
				System.out.println(person1);
				person1.setFirstname("Allison");
				System.out.println(person1.getFirstName());
				System.out.println("***********************");
				
				AccountHolder person2 = new AccountHolder("Jim", "Lee", "Williams", "564123951", 100, 1000);
				System.out.println(person2);
				
				
				
//				person1.getCheckingAccount(2500);
//				System.out.println(person1);
				double value = 100 * Math.pow(1.01, 3);
				System.out.println(value);
		
	}
	
}