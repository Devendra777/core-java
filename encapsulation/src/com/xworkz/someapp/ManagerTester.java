package com.xworkz.someapp;

import java.util.Scanner;

import com.xworkz.someapp.manager.Manager;

public class ManagerTester {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Manager manager = new Manager();
		System.out.println("Enter the Manager Id");
		int managerId =sc.nextInt()  ; 
		manager.setManagerId(managerId);
		System.out.println("Enter the Manager Name ");
		manager.setManagerName(sc.next());
		System.out.println("Enter the Manager Address ");
		manager.setAddress(sc.next());
		
		System.out.println(manager.getManagerId() +" " + manager.getManagerName() + "  "+ manager.getAddress() );
	}

}
