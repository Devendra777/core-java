package com.xworkz.hospitalapp.hospital;


public class Hospital {
	//String patientNames[] = {null , null , null , null , null };
	  // Datatype variableName[]  = {value}; 
	 
	  // Datatype variableNames[] = new Datatype[size] ; 
	    String patientNames[] = new String[6];
	    int index ; 
	    
	    public Hospital() {
			System.out.println("Hospital Object is created");
		}
	    
	      public  void savePatientNames(String patientName) {
	    	  System.out.println("inside savePatientNames ");
	    	    if(patientName != null && patientNames.length > index) {
	    	     patientNames[index++] =  patientName ; 
	    	     return  ; 
	    	    }
	    	    else {
	    	    	System.out.println("Pateint Names is full... Bed Illa");
	    	    }
	    	  System.out.println("end of  savePatientNames ");
	    	  return  ; 
	      }
	  
	      
	      public void getPatientNames() {
	    	  System.out.println("List of all the patient names");
	    	 for (int i = 0; i < patientNames.length; i++) {
				System.out.println(patientNames[i] + " ");
			}
	    	
	      }
	     
	       // oldPatientName = "Guna";
	      // newPatientName = "Guna Sarkar";
	       public boolean updatePatientNames(String oldPatientName , String newPatientName)
	       {
	    	   System.out.println("inside updatePatientNames");
	    	   for (int i = 0; i < patientNames.length; i++) {
	    		        // Guna == Guna
				      if(patientNames[i] == oldPatientName) {
				    	  patientNames[i]  = newPatientName ; 
				    	  return true ; 
				        }
				      else {
				    	  // you have to get one negative messages
				      }
			    }
	    	   return false ; 
	       }
	       
	       
	      

}
