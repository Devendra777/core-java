package com.xowrkz.overloading;

import com.xowrkz.overloading.conceptoverloading.PetrolBunk;

public class PetrolBunkTester {

	
	
	public static void main(String[] args) {
		
		/*
		 * String workersName[] = { "Akash", "Sumanth", "Sneha", "Sushma", "Navya",
		 * "Sagar", "Sandeep" }; PetrolBunk bunk = new PetrolBunk(123,
		 * "DeveGowda Petrol Bunk", "Banshankari 2nd Stage", workersName);
		 * System.out.println(bunk.id + " " + bunk.name);
		 */
		String workersName[] = { "Akash", "Sumanth", "Sneha", "Sushma", "Navya",
				  "Sagar", "Sandeep" };
		PetrolBunk bunk2 = new PetrolBunk(workersName);
		bunk2.displayDetails();
		
	}
}
