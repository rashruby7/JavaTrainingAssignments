package com.String;

import java.util.Scanner;

public class DescString {

	public static void descending()
	{
		String s1;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want in descending order");
		s1=sc.next();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			System.out.println(c);
		}	
	}
	public static void main(String[] args) {
		DescString.descending();
	}
}
