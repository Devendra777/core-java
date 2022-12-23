package com.xworkz.manageapp.manager;

public class Manager {

	public int managerId;
	public String managerName;
	public String address;
	public String qualification;
	public long contactNo;
	public String gender;

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

}
