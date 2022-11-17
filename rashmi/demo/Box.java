
package com.rashmi.demo;

public class Box {

	protected int length;
	protected int breadth;
	protected int height;

	
	public Box()
	{
		this(0);
		System.out.println("in the class 0 arg constructor");
	}
	
	Box(int length)
	{
		this(0,0,0);
		System.out.println("in the box class 1 arg constructor");
		
	}
	public Box(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		System.out.println("");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	public int calcVolume()
	{
		return this.length*this.breadth*this.height;
	}
	
}
