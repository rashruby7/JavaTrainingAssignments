package HealthCare;

import java.util.Scanner;


public class PatientRun extends Patient {

	
	public static void main(String[] args) {
		
		Patient p1=new Patient();
	    p1.patientdetails();
		System.out.println("BMI of patient is : "+p1.computeBMI());
		
	}
	
}
