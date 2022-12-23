package com.xworkz.manageapp.showroom;

import com.xworkz.manageapp.manager.Manager;

public class ShowRoom {

	Manager manager[] = new Manager[2];
	int index;

	public ShowRoom() {
		System.out.println("ShowRoom  Object is created");
	}

	public boolean saveManager(Manager manager) {
		System.out.println("Inside saveManager method ");
		boolean isAdded = false;
		if (manager.managerName != null && !(manager.managerName.isEmpty())) {
			System.out.println("Manager name is perfect.. proceed with storing the data");

			// manager[0] = manager
			this.manager[index++] = manager;
			isAdded = true;
		}
		return isAdded;

	}

	public void getAllManagers() {
		System.out.println("List of all the managers ");
		for (int i = 0; i < manager.length; i++) {
			System.out.println(manager[i].managerId + " " + manager[i].managerName + " " + manager[i].gender + " "
					+ manager[i].contactNo + " " + manager[i].qualification);
		}
	}

	public Manager getManagerByManagerQualification(String qualification) {
		System.out.println("inside getManagerByManagerQualification method");
		System.out.println("One paramter : String " + qualification);
		for (int i = 0; i < manager.length; i++) {
			// "MBA" == "MBA"
			if (manager[i].qualification == qualification) {
				System.out.println("Qualification is matched returning the Manager info");
				System.out.println(manager[i].managerId + " " + manager[i].managerName + " " + manager[i].gender + " "
						+ manager[i].contactNo + " " + manager[i].qualification);

				return manager[i];
			}
		}
		return null;
	}

}
