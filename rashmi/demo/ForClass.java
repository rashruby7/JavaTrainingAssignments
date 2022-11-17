package com.rashmi.demo;

public class ForClass {
	
	public static void printMaster(int n)
	{
		if(n<1)
		
			return;
		printMaster(n-1);
		System.out.println(n+"  ");
		
		
	}
	
	public static void printMasterReverse(int n)
	{
		if(n<1)
		
			return;
		
		System.out.println(n+"  ");
		printMaster(n-1);
		
	}
 public static void main(String[] args) {
	
	 int sum=0;
	 for(int i=1;i<=10;i++)
	 {
		 sum+=i;
		 System.out.println("the sum of first 10 natural nos "+sum);
		 ForClass.printMaster(10);
		 ForClass.printMasterReverse(10);
		 
	 }
	
		 
}
}
