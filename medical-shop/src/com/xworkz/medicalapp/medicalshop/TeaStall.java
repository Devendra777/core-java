package com.xworkz.medicalapp.medicalshop;

public class TeaStall {
	
	
	 public static  String name ; 
	 public int teaStallId ; 
	 public String ownerName ; 
	 
	 {
		 System.out.println("first Instance block");
	 
	 
	 }
	 
	 static {
		 System.out.println("second Instance block");
	   
		 {
			 System.out.println("inner instance block");
	     }
	 
	 }
	
	
	public TeaStall(int id , String name , String ownerName) {
		// wrt id , using this is  optional
		System.out.println("TeaStall Constructor is called");
		this.teaStallId = 	id ; 
		
		// wrt name , ownerName ,
	///this keyword is to avoid naming conflict b/w the paramter and instance variables
		this.name = name ; 
		this.ownerName = ownerName ; 
		
		
		// invoking a displayInfo in a constructor using this keyword
		this.displayInfo();
		
	}
	
	
	 public  static void displayInfo() {
		 //   invoking variables of a current class using this keyyword
		// System.out.println(TeaStall.name + "  "+ this.teaStallId + " "+ this.ownerName); 
		 
		 {
			   
		 }
		 
		 
	 }
	 
	 
	
	

}
