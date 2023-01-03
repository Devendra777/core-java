package com.xworkz.someapp.manager;


// Encapsulated Class 
public class Manager {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	// Encapsulation
	private int managerId;
	private String managerName;
	private String address;
	private String qualification;
	private long contactNo;
	private  String gender;

	public Manager(int managerId, String managerName, String address, String qualification, long contactNo,
			String gender) {
		System.out.println("Manager Object is created");
		this.managerId = managerId;
		this.managerName = managerName;
		this.address = address;
		this.qualification = qualification;
		this.contactNo = contactNo;
		this.gender = gender;
	}
	
	
	// public setter and getter methods
	      public void setManagerId(int managerId) {
	    	  this.managerId = managerId ; 
	      }
	      
	      public  int getManagerId() {
	    	  return managerId;
	      }
	      
	      public void setManagerName(String managerName)
	      {
	    	  this.managerName=managerName;
	      }
	      
	      public String getManagerName()
	      {
	    	  return managerName;
	      }
	      
	      public void setAddress(String address) {
	    	  this.address=address;
	    	  
	      }
	      
	 public  String getAddress() {
		 return address;
	 }
	 
	 public void setQualification(String qualification) {
		 this.qualification = qualification;
	 }
	 
	 public String getQualification() {
		 return qualification;
	 }
	public void setContactNo(long contactNo) {
		this.contactNo=contactNo;
		
	}
	 public long getContactNo() {
		 return contactNo;
	 }
	 public void setGender(String gender) {
		 this.gender=gender;
	 }
	 public String getGender() {
		 return gender;
	 }
	

	
	

}
