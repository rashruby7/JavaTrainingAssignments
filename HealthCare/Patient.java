package HealthCare;

import java.util.Scanner;

public class Patient {

	
	protected String pname;
	protected double height;
	protected double weight;
		
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
  
	 void patientdetails()
     {
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.println("Enter the Employee Name: ");
    	 pname=sc.next();
    	 System.out.println("Enter the Employee weight : ");
    	 weight=sc.nextInt();
    	 System.out.println("Enter the employee height : ");
    	 height=sc.nextInt();
    	 
    	 
     }
	
	public double computeBMI()
	{
		
		return this.weight / (this.height * this.height);
		
	}
	
}
