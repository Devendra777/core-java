package com.xworkz.interview;

public class InterviewTester {

	
	   public static void reverse(String data) {
		   
		char newData[] =  data.toCharArray() ; 
		 
	//	 char newData[] =  {'D' ,'e','v','e','n','d','r','a' } ; 
		 // index = length-1
		 for(int index = 0; index < newData.length; index++) {
			 System.out.print(newData[index] + " ");
		 }
		 for(int index = newData.length-1; index >= 0 ; index--) {
			 System.out.print(newData[index] + " ");
		 }
		   
	   }
	
	
	public static void main(String[] args) {
		
		reverse("Devendra");
		
		//reverseMiddleWords("My Name is Devendra");
		
		//convertFirstCharacterToUppercase("my name is devendra");
		
		
	}
}
