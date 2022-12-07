package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Patient {
	
	   private  String patientName ; 
	   private  String address ;
	   private  Gender gender  ;
	   private  Integer age ; 
	   
	    public Patient() {
			// TODO Auto-generated constructor stub
		}
	public Patient(String patientName, String address, Gender gender , Integer age) {
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age ; 
	} 
	
	public void displayInfo() {
		System.out.println("Patient Name is: "+ patientName);
		System.out.println("Patient Address is: "+ address);
		System.out.println("Patient Gender  is: "+ gender);
	}
	    


}
