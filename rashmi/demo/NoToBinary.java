package com.rashmi.demo;

public class NoToBinary {

	public static void toBinary1(int num)
	{
		int binary[]=new int[40];
		int index=0;
		
		while(num>0)
		{
			binary[index++]=num%2;
			num=num/2;
			
		}
		for(int i=index-1;i>=0;i--)
		{
		 System.out.print(binary[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.print("binary conversion of no 10 is ");
	    NoToBinary.toBinary1(10);
	    
	    System.out.print("binary conversion of no 20 is ");
	    NoToBinary.toBinary1(20);
		
	}
	
}
