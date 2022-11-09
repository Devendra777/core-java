package com.xowrkz.overloading.conceptoverloading;

public class PetrolBunk {
	
	
	// instance variables/ states / properties / fields
	    public int id  ; 
	    public String name ; 
	    public String location;
	    public String workersName[] = new String[7];
	    
	    
	    public PetrolBunk() {
			System.out.println("Default Constructor is called");
		}
        // Default Constructor
	    public PetrolBunk(String workersName[]) {
	    this(123, "DeveGowda Petrol Bunk", "Banshankari 2nd Stage",workersName);
		System.out.println("one parameterized constructor is called");	
		}
	    
	    //parameterized Constructor
	    public PetrolBunk(int id , String name , String location , String[] workersName)
	    {
	    	// below statement is used for Constructor Chaining;
	       this();
	    	System.out.println("Calling 4  parameterized Constructor");
	    	this.id = id ; 
	    	this.name = name ;
	    	this.location = location;
	    	this.workersName  = workersName ; 
	    	
	    }


	    
	    
	    public void provideFuels() {
	    	
	    }
			public  void displayDetails() {
				System.out.println("displayDetails() is invoked");
				System.out.println(this.id + "  "+ this.name + " "+ this.location  );
				System.out.println("list if Workers For "+ this.name);
				for (int i = 0; i < workersName.length; i++) {
					System.out.println(workersName[i]);
				}
		}
	    

		
}
