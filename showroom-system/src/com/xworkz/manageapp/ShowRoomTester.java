package com.xworkz.manageapp;

import com.xworkz.manageapp.manager.Manager;
import com.xworkz.manageapp.showroom.ShowRoom;

public class ShowRoomTester {
	
	public static void main(String[] args) {
		
		ShowRoom room = new ShowRoom();
		  
		Manager manager = new Manager(1, "Mahesh", "Yelahanka", "MBA",8908908909L , "male");
		
		
		Manager manager1 = new Manager(2, "Manisha", "Rajajinagar", "Mcom",8908908908L , "female");
		
		
		
		room.saveManager(manager);
		
		room.saveManager(manager1);
		
		room.getAllManagers();
		
		
		
		room.getManagerByManagerQualification("Mcom");
		
		// room.getManagerByManagerAddress("address");
		// room.getManagerByThierContactNo(contactNo);
		// room.getManagerByManagerName("name of the manager");
		// room.getManagerbyGender("gender")
	}

}
