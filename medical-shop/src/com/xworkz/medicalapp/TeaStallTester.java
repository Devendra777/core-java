package com.xworkz.medicalapp;

import java.util.Scanner;


 // import package+ClassName  = FQCN / Qualified Name ; 

public class TeaStallTester {
	 
	
	  
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		
		TeaStall test = new TeaStall(1, "somename","");
	//System.out.println(test.name + "   "+  test.id);
		System.out.println("main method ended");
		
	}

}
