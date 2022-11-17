package com.interfaces;

public interface Dog {
 
	void bark();
	void eat();
	default void sleep()
	{
		System.out.println("dozeoff");
	}
}
