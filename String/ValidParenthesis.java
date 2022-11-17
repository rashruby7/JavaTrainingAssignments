package com.String;

import java.util.Stack;

public class ValidParenthesis {

	
	public static void parenthesis(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(char st:s.toCharArray())
		{
			if(st=='{' || st=='(' || st=='[')
			{
				stack.push(st);
			}
			else {
				if(stack.empty())
				{
					System.out.println(s+"invalid parenthesis");
					return;
					
				}
				else {
					 
			}}
		}		
		
	}
 public static void main(String[] args) {
	String s1="{(({()}))}";
	String s2="(][)";
	String s3="{((";
	
}
}
