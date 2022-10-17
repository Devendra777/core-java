package com.xworkz.airport;

public class Employee {
	
	static	public String companyName ; 
    public static String companyAddress  ;
	
	public String employeeId ; 
	public String name ;
	public String bloodGrroup ; 
	
	// default const
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	// use of Constructor is to init the instance variable of a class
	// parameterized const
	public Employee(String employeeId , String name , String bloodGrroup) {
		System.out.println("Employee Object is creeated");
		this.employeeId = 	employeeId ; 
		this.name = name ; 
		this.bloodGrroup = bloodGrroup  ; 
	}
	
	
	  public void  toHelpOrgToGrow(){
	        System.out.println("naane naanu....");    	
	             }

}
