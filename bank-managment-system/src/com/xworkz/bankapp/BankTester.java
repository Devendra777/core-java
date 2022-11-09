package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankTester {

	
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		   account.deposit(5000);
		   account.deposit(7000);
		   account.withDraw(1000);
		   System.out.println("My Account Balance is"+account.getBalance());
		   
		   BankAccount freindsAccount = new BankAccount();
		   freindsAccount.deposit(700);
		   freindsAccount.deposit(4000);
		   //String dullAccount = null ;
		   // Transfering Amount from My account to Freinds Account
		   account.transfer(500.00, freindsAccount);
		   System.out.println("My Account Balance is"+account.getBalance());
		  
		   
		   
		   System.out.println("The Freind's account balance is"+freindsAccount.getBalance());
		//double withDrawnAmount = account.withDraw(400);	
	//	System.out.println("Thank you for WithhDrawing "+ withDrawnAmount);
		
		   
		   
		   
		   
		   SavingsAccount savingsAccount = new SavingsAccount();
		    
		   savingsAccount.deposit(1000);
		   savingsAccount.deposit(8000);
		   savingsAccount.withDraw(2000);
		   savingsAccount.periodicInterest() ;
		   System.out.println("My Account Balance is"+savingsAccount.getBalance());
		   
		   
		   SavingsAccount maaSavingsAccount = new SavingsAccount();
		   maaSavingsAccount.deposit(1000);
		   
		   savingsAccount.transfer(4000, maaSavingsAccount);
		   
		   
		   
		   maaSavingsAccount.transfer(2000.00, savingsAccount);
		   System.out.println("My Savings Account Balance is"+savingsAccount.getBalance());
		   
		   System.out.println("My Mom's Savings Account Balance is"+maaSavingsAccount.getBalance());
		   
		   
			
			  CurrentAccount business = new CurrentAccount();
			  business.deposit(3000);
			 
		   
		   
			  
			   SavingsAccount  savingsAccount2 = new SavingsAccount(0.7);
			   savingsAccount2.deposit(1000);
			   savingsAccount2.periodicInterest();
			   System.out.println(savingsAccount2.getBalance());
		   
		   
		   
		   
		   
		   
		   
		   
		
	}
}
