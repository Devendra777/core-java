package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {
	
	  public  Patient patient ; 
	  public  boolean  isEmergency =true ; 
	  public  boolean isTreatmenRequired = true ;
	  
	  public boolean admit(Patient patient) {
		  boolean isAmditted = false ;
		  if(isTreatmenRequired == true) {
		   if(isEmergency == true) {
		    	   this.patient= patient ; 
		    	  this.patient.displayInfo();
		    	  System.out.print("Patient can be allowed in ICU ward");
		    }
		   else {
			   System.out.println("Add the Patient in general ward");
		   }
		  }else {
			  System.out.println("No Treatment required Maneg hogi Enjoyy Maadi...");
		  }
		  
		  return isAmditted ; 
	  }

}
