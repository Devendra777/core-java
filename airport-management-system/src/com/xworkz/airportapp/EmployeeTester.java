package com.xworkz.airportapp;

import com.xworkz.airportapp.employee.Employee;

public class EmployeeTester {
	      public static void main(String[] args) {
			
	    	  // static members can be shared among multiple Objects
	    	Employee.companyName  = "Amazon"; 
	    	  
	    	   Employee emp =new Employee("AWS123" , "Shivu M" , "B+");
	    	   // instance members cannot be shared among multiple Objects
	    	   System.out.println(emp.employeeId + "  "+ emp.name+ " "+ emp.bloodGrroup);
	    	  System.out.println(Employee.companyName ) ; 
	    	   
	    	   
	    	   Employee emp1 =new Employee("AWS124" , "Akash" , "AB+");
	    	   System.out.println(Employee.companyName ) ; 
	    	   System.out.println(emp1.employeeId + "  "+ emp1.name+ " "+ emp1.bloodGrroup);
	    	   
	    	   Employee emp2 =new Employee("AWS125", "Barbie  Doll","AB+");
	    	   System.out.println(emp2.employeeId + "  "+ emp2.name+ " "+ emp2.bloodGrroup);
	    	   System.out.println(Employee.companyName ) ; 
	    	   
	    	   
	    	   
		}
}
