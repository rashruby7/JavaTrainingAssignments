package com.String;

public class StringRotation {
	public static void generaterotate(String s) {
		
		for(int i=0;i<s.length()-1;i++)
		{
			s=StringRotation.rotate(s);
			System.out.println(s);
		}
	}
	public static String rotate(String s)
	{
		return s.charAt(s.length()-1)+s.substring(0,s.length()-1);
	}	
	
public static void main(String[] args) {
	
	
	//System.out.println(StringRotation.rotate("rashmi"));
	StringRotation.generaterotate("ertyiu");
}
	
}
