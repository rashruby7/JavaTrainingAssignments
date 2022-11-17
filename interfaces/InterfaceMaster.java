package com.interfaces;

public class InterfaceMaster implements Dog{
public static void main(String[] args) {
	Dog d1[]= {new Labrador(),new Pummerian()};
	Dog d2= new Labrador();
	for(Dog g:d1)
	{
		g.bark();
	}
	
	d2.bark();
	d2.eat();
	
	
	
	

Dog d3=new Dog() {
@Override
public void bark() {
	// TODO Auto-generated method stub
	System.out.println("bhwowow");
	
}

@Override
public void eat() {
	// TODO Auto-generated method stub
	System.out.println("eat eat");
}
};

d3.bark();
d3.eat();
Runnable r1=new Runnable()
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ex) {}
	
	}
	
};
new Thread(r1).start();


}

@Override
public void bark() {
	// TODO Auto-generated method stub
	
}

@Override
public void eat() {
	// TODO Auto-generated method stub
	
}
}
