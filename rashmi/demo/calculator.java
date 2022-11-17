package com.rashmi.demo;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int result;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the choice: ");
		char choice=sc.next().charAt(0);
		
		System.out.println("Enter the first number : ");
		
		int a=sc.nextInt();
		
		System.out.println("Enter the second number : ");
		
		int b=sc.nextInt();
		
		
		switch(choice)
		
		{
			case 1 : System.out.println("Perform the Addition: ");
			         result=a+b;
			         System.out.println("Addition is : "+result);
			         break;
			case 2 : System.out.println("Perform the substraction : ");
			         result=a-b;
			         System.out.println("substraction is : "+result);
			         break;
			case 3 : System.out.println("Perform the Multiplication : ");  
			         result=a*b;
			         System.out.println("Multiplication is : "+result);
			         break;
			case 4 : System.out.println("perform the division");
			         result=a/b;
			         System.out.println("Division is : "+result);
			         break;
			         
		    default: System.out.println(" this is default case");
		             break;
		           
		    
		}
	}
	
}
