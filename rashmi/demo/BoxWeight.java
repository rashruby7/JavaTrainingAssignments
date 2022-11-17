package com.rashmi.demo;

public class BoxWeight extends Box {
  private int weight;
  
    public BoxWeight()
    {
    	System.out.println("this is 0 arg constructor");
    	
    }
    
    public BoxWeight(int length, int breadth, int height,int weight)
    {
    	
		/*
		 * this.breadth=breadth; this.height=height; this.length=length;
		 * this.weight=weight;
		 */
    	
    	
    	super(length,breadth,height);
    	this.weight=weight;
    	
    	
    	System.out.println("3 arg constructor");
    	
    	
    }

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
    
  public int calcDensity()
  {
	return this.weight/(this.length*this.breadth*this.height);
	  
  }
  
}
