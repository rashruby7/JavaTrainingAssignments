package com.rashmi.demo;

public class MyClass {
	
	
	public static int Max(int a,int b)
	{
		return a>b?a:b;
	}
	
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		for(int i=2;i<=n-1;i++)
		{
			if(n%1==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static int sumDigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;

		}
		return sum;
	}
   public static void main(String[] args)
   {
	   int a=10;
	   int b=20;
	   int c=40;
	   int d=25;
	   int n=1234;
	   
	   System.out.println("...Hello Master Developer...");
	   System.out.println("the value of a is"+a);
	   System.out.println("the value of b is"+b);
	   System.out.println("the value of c is"+c);
	   
	   if(a>b)
	   {
		   if(a>c)
		        System.out.println("a is the greatest");
		   else
			   System.out.println("c is the greatest");
		   
	   }else
	   {
		   if(b>c)
			   System.out.println("b is the greatest");
		   else
			   System.out.println("c is the greatest");
		   
	   }
	   
	   //System.out.println(a>b?(a>c?a:c):(b>c?b:c));
	   //System.out.println(MyClass.Max(a, c));
	   //System.out.println(MyClass.Max(a, MyClass.Max(b, MyClass.Max(c, d))));
	  // System.out.println(MyClass.isPrime(n));
	   //System.out.println(MyClass.sumDigits(n));
	   System.out.println("");
   }
   
}
