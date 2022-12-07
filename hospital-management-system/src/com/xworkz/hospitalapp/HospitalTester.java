package com.xworkz.hospitalapp;

import java.util.Scanner;


import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	
	public static void main(String[] args) {
	
        Scanner	scan = new  Scanner(System.in);
        System.out.print("Enter the Patient Name");
         String patientName = scan.next() ; 
         System.out.print("Enter the Patient Address");
          String address =    scan.next();
          System.out.print("Enter the Patient's Age");
          int age =    scan.nextInt() ; 
		Patient patient = new Patient(patientName , address, Gender.MALE,age);
	   
		Hospital  hospital = new Hospital();
		hospital.admit(patient);
		
		System.out.println(patient.gender);
	
		scan.close();
	}

}
