package com.String;

import java.util.Scanner;

public class NoVowels {

	public static void remove() {
		String s1="";
		String s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to remove vowels from....");
		s1=sc.next();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a' || c[i]=='b')
			{
				s2=s2+" ";
			}
			else if(c[i]=='e' || c[i]=='E')
			{
				s2=s2+" ";
			}
			else if(c[i]=='i' || c[i]=='I')
			{
				s2=s2+" ";
			}
			else if(c[i]=='o' || c[i]=='O')
			{
				s2=s2+" ";
			}
			else if(c[i]=='u' || c[i]=='u')
			{
				s2=s2+" ";				
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
			System.out.println(s2);
		}
		
		
	}
	public static void main(String[] args) {
	      NoVowels.remove();
	}
}
