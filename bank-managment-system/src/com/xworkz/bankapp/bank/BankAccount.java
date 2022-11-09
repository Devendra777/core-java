package com.xworkz.bankapp.bank;


// parent / Super / Base class
public class BankAccount {

  public	String name;
	String ifscCode;
	String branchName;
	// will see
	String accountNo;

	// Encapsulation
	private double balance;
	
	
	
	
	
	public BankAccount() {
		System.out.println("BankAccount Object is created");
		System.out.println(name);
	}

	public double withDraw(double balance) {
		System.out.println("The Amount to be withdrwan" + balance);
		this.balance = this.balance - balance;

		return this.balance;
	}


	// balance = 5000
	public double deposit(double balance) {
		System.out.println("Amount to be deposited" + balance);
		// 0.0 + 5000 .
		this.balance = this.balance + balance;

		return this.balance;
	}

	public void transfer(double amount, BankAccount freindsAccount) {
		System.out.println("Transferring to Friend's Account ");
		withDraw(amount);
		freindsAccount.deposit(amount);
		System.out.println("Transferring Done.. Transaction Successfull");
	}
	
	
    public void setBalance(double balance) {
    	this.balance=balance;
    }
    

    public double getBalance() {
    	return balance ;
    }
}
