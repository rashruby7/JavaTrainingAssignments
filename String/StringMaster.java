package com.String;

public class StringMaster {

	
	public static String findLongest(String [] arr)
	{
		
	int index=0;
	int elementlength=arr[0].length();
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i].length()>elementlength)
				{
				   index=i;
				   elementlength=arr.length;
						   
				}
			}
			return arr[index];
	}		
	
	public static boolean ispalindrome(String s)
	{
		if(s.length()==1 || s.length()==0)
		{
			return true;
		}
		else
		{
			return (s.charAt(0)==s.charAt(s.length()-1) && ispalindrome(s.substring(1,s.length()-2)));
		}
	}
	public static String isInitCap(String s)
	{
		return s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
	}
	public static String nameDisplay(String s) 
	{
		return s.substring(0,1).toUpperCase()+"."+StringMaster.isInitCap(s.substring(s.indexOf(' ')+1,s.length()));
	}
	
	public static String nameDisplayMaster(String s)
	{
		return s.substring(0,1).toUpperCase()+"."+StringMaster.nameDisplay(s.substring(s.indexOf(' ')+1, s.length()));
	}
	
	
	public static String rotation(String s)
	{
		return s.charAt(s.length()-1)+s.substring(0,s.length()-1);
	}
	
	public static String rotation1(String s)
	{
		return StringMaster.rotation(s.charAt(s.length()-1)+s.substring(0,s.length()-1));
	}
	public static void main(String[] args) {
		String s1="amit";
		String s2="jatin";
		String s3="amit";
		//s1+=" nigam";
		//System.out.println("s1="+s1);
		//System.out.println("s3="+s3);
	
		String []arr= {"amit","nitin","sujata","rashmi","neha"};
	/*
	for(String s:arr)
		{
			System.out.print(s+"  ");
		}
	}	
		*/
		
		//System.out.println(StringMaster.isInitCap(s3));
		//System.out.println(StringMaster.findLongest(arr));
		System.out.println(StringMaster.rotation1("rashmi"));
	}
	
}
