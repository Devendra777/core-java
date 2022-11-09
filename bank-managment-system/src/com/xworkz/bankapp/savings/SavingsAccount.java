package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bank.BankAccount;

// Child / Sub / Derived class
public class SavingsAccount extends BankAccount  {
	
	    
	  public double interestRate ; 
	
	  public SavingsAccount(double interestRate) {
		  super();
		  System.out.println("Savings Account object is created");
		  this.interestRate = interestRate ; 
		 
		// TODO Auto-generated constructor stub
	}
	
	// Properties BankAccount is noe occupied by SavingsAccount
	
	// acquire data(methods variables)
	// same type
	//same operations
	//merge data
	// occupy the features
	
	
	  // SavingsAccount specific method
	 public void periodicInterest() {
		 double newBalance =  super.getBalance() * this.interestRate/100 ; 
		 deposit(newBalance);
	 }


}
