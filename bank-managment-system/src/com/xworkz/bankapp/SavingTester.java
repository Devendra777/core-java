package com.xworkz.bankapp;

import com.xworkz.bankapp.savings.SavingsAccount;

public class SavingTester {
	
	
	
	
	public static void main(String[] args) {
		
	
		 SavingsAccount account = new SavingsAccount(0.7);
		 account.name = "Hdfc bank";
		 System.out.println(account.name);
	}

}
