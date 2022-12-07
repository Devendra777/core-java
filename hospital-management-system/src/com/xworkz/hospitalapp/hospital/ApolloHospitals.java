package com.xworkz.hospitalapp.hospital;

import java.util.Arrays;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitals extends Hospital {

	// One to Many
	public Patient[] patients;

	Patient newPatients[];
	int index;

	public ApolloHospitals(int size) {
		patients = new Patient[size];
	}

	public boolean addPatient(Patient patient) {
		System.out.println("inside addPatient method");
		boolean isPatientAdded = false;
		if (patient != null) {
			System.out.println("Patient's details are right.. go ahead");
			patients[index++] = patient;
			isPatientAdded = true;
			// index++ ;

		}
		return isPatientAdded;
	}

	public void getAllPatients() {
		System.out.println("List of Patients are :");
		for (int i = 0; i < patients.length; i++) {
			System.out.println(patients[i].getAddress() + "  " + patients[i].getPatientName() + "  "
					+ patients[i].getAge() + "  " + patients[i].getGender());
		}
	}

	public void getPatientByName(String patientName) {
		System.out.println("inside getPatientByName");
		System.out.println("No of parameters : 1 : patientName(String)");
		for (int i = 0; i < patients.length; i++) {

			if (patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getAddress() + "  " + patients[i].getPatientName() + "  "
						+ patients[i].getAge() + "  " + patients[i].getGender());
			} else {
				System.out.println("No Patient  found");
			}

		}

	}

	public boolean updatePatientAddressByName(String name, String newPatientAddress) {
		boolean isUpdated = false;
		System.out.println("inside updatePatientAddressByName");
		System.out.println("No of parameters : 2 : 1) param patientName(String)  2) param patientAddress(String)");
		for (int i = 0; i < patients.length; i++) {

			if (patients[i].getPatientName().equals(name)) {
				System.out.println("Patient name is matched... proceed with updating the address");
				patients[i].setAddress(newPatientAddress);
				isUpdated = true;
			}
		}
		return isUpdated;
	}

	public boolean deletePatientByName(String patientName) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length - 1];
		// int j=0 ;
		for (int i = 0, k = 0; i < patients.length; i++) {
			if (!patients[i].getPatientName().equals(patientName)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		// System.out.println(Arrays.toString(newPatients.));

		return isDeleted;
	}

	public void getAllNewPatients() {
		System.out.println("List of Patients are :");
		for (int i = 0; i < newPatients.length; i++) {
			System.out.println(newPatients[i].getAddress() + "  " + newPatients[i].getPatientName() + "  "
					+ newPatients[i].getAge() + "  " + newPatients[i].getGender());
		}
	}

}
