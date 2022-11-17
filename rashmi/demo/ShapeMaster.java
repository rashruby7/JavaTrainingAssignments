package com.rashmi.demo;

class Shape{	
	void draw()
	
	{
		System.out.println("drawing a shape");
	}
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("drawing a rectangle");
		
	}
}
class Square extends Shape{
	void draw()
	{
		System.out.println("drawing a sqaure");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("drawing a triangle");
	}
}

public class ShapeMaster {

	public static void main(String[] args) {
		
		Shape s1[]= {new Square(),new Triangle(),new Rectangle()};
		for(Shape s:s1)
			s.draw();
	}
}
;
