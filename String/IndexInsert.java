package com.String;

import java.util.Scanner;

public class IndexInsert {

	
	public static void Insert() {	
		String s1;
		String s2;
		int index=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String");
	s1=sc.next();
	System.out.println("Enter the second String");
	s2=sc.next();
	System.out.println("Enter the index for first String");
	index=sc.nextInt();
	if(s1!=null)
	{
		 String s3=s1.substring(0,index)+s2.substring(index);
		 System.out.println("After Inserted String :"+s3);
	}
    
	}
    public static void main(String[] args) {
		
    	IndexInsert.Insert();
	}
}
