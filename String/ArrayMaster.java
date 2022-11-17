package com.String;

public class ArrayMaster {

	 public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" ");
			
		}
		for(int a:arr)
		{
			System.out.println(a+" ");
		}
		
		int brr[][]= new int[3][];
		
		brr[0]=new int[1];
		brr[1]=new int[2];
		brr[2]=new int[3];
		
		
		/*
		 * for(int i=0;i<3;i++) { for(int j=0;j<2;j++) { System.out.println(); } }
		 */
		
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				brr[i][j]=i+j;
			}
		}
		
		for(int [] sm:brr)
		{
			for(int x:sm)
				System.out.println(x+" ");
			System.out.println();
		}
	}
}
