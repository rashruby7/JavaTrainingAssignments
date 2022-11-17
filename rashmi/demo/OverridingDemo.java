package com.rashmi.demo;


class A{
	int i=10;
	void f1()
	{
		System.out.println("In a A class f1 method");
	}
}

class B extends A{
	int i=20;
	void f1()
	{
		System.out.println("In B class F1 method");
	}
}
public class OverridingDemo {
 public static void main(String[] args) {
	A a1=new B();
    System.out.println(a1.i);
    a1.f1();
}
}
