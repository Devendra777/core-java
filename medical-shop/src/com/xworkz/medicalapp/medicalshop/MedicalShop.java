package com.xworkz.medicalapp.medicalshop ; 

public class MedicalShop {

	public  String gstNo ;
	public  String address ; 
    public   String name ; 
    public String  staffNames[]  ;
	public  long  staffContactNo[] ;
    public String medicineNames[] ; 
    public String cosmetics[] ; 
	public  int noOfSections ; 
	public String billingMethod[] ; 
	
	 
	 public MedicalShop(String gstNo, String address, String name, String[] staffNames, long[] staffContactNo,
			String[] medicineNames, String[] cosmetics, int noOfSections, String[] billingMethod) {
		this.gstNo = gstNo;
		this.address = address;
		this.name = name;
		this.staffNames = staffNames;
		this.staffContactNo = staffContactNo;
		this.medicineNames = medicineNames;
		this.cosmetics = cosmetics;
		this.noOfSections = noOfSections;
		this.billingMethod = billingMethod;
	}


	public void displayInfo() {
		 System.out.println("Medical Shop name is"+name);
		 System.out.println("=======================");
        System.out.println("Medical Shop gst no is "+ gstNo);
        System.out.println("=======================");
        System.out.println("Medical Staff Info");
        for (int i = 0; i < staffNames.length; i++) {
			  System.out.println(staffNames[i]);
		}
        System.out.println("=========================");
        System.out.println("Medical Staff's Contact No");
        for (int i = 0; i < staffContactNo.length; i++) {
			  System.out.println(staffContactNo[i]);
		}
        System.out.println("=========================");
        System.out.println("List of Medicines ");
        for (int i = 0; i < medicineNames.length; i++) {
			  System.out.println(medicineNames[i]);
		}
        System.out.println("=========================");
        System.out.println("Billing Methods ");
        for (int i = 0; i < billingMethod.length; i++) {
			  System.out.println(billingMethod[i]);
		}
        
		
	 }
	 
	 
	  
}
