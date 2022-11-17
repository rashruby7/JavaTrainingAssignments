package com.object;

class Trainee{
	
	int id;
	String name;
	
	public Trainee()
	{
		
	}
	   public Trainee(int i, String string, int j)
	   {	  
	   }
	   }

public class ObjectMaster {
   int id;
   String name;
   int age;
   
   
  public ObjectMaster(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}


public static void main(String[] args) {
	Trainee t1=new Trainee(1,"rash",23);
	Trainee t2=new Trainee(1,"rash",23);
	Trainee t3=new Trainee(2,"rashmi",24);
	Trainee t4=new Trainee(2,"rashmi",24);
	Trainee t5=new Trainee(3,"sujata",25);
	Trainee t6=new Trainee(4,"sujata",25);
	
	Trainee tarr[]= {t1,t2,t3,t4,t5,t6};
	
	if(t1.equals(t2))
		System.out.println("trainee is equal");
	else
		System.out.println("trainee are unequal");
	
}
	 
}
