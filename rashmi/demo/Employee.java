package com.rashmi.demo;

import java.util.Scanner;

public class Employee {

	private String empname;
	private int empid;
	private double basic_salary,gross_salary,DA,IT,net_salary;
	
	public void employeeDetails()
	{
		System.out.println("Enter Employee Details: ");
		
	}
	public void read()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ENTER THE EMPLOYEE ID: ");
		empid=scan.nextInt();
		System.out.println("Enter the employee name: ");
		empname=scan.next();
		System.out.println("Enter the employee basic salary : ");
		basic_salary=scan.nextInt();
		
		calculate();				
	}
	public void calculate()
	{
		DA=(52/100)*basic_salary;
		gross_salary=basic_salary+DA;
		IT=gross_salary*0.30;
		net_salary=(basic_salary+DA)-IT;		
		
	}
	public void display()
	{
		
		System.out.println("employee id : "+empid);
		System.out.println("employee name : "+empname);
		System.out.println("basic salary of employee : "+basic_salary);
		System.out.println("employee net salary : "+net_salary);
		
		
	}
	public static void main(String[] args) {
		
		
		Employee emp=new Employee();
				emp.read();
		        emp.display();
		        	
	}
	
}
