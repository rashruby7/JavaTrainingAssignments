package com.rashmi.demo;

public class SumOfDigitRec {

	public static int digitRec(int n)
	{
		if(n==0)
			return 0;
		return (n%10 +digitRec(n/10));
		
	}
	public static void main(String[] args) {
		int n=24354;
		System.out.println(SumOfDigitRec.digitRec(n));
	}
}
