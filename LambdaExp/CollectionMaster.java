package LambdaExp;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class CollectionMaster{

	public static void main(String[] args) {
		
		Person p1=new Person(1,"rashmi",21);
		Person p2=new Person(2,"sujata",22);
		Person p3=new Person(3,"rakesh",23);
		Person p4=new Person(4,"rushi",24);
		Person p5=new Person(5,"komal",25);
		Person p6=new Person(6,"madhan",26);
		Person p7=new Person(7,"montu",27);
		List <Person> persons=Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		Collections.sort(persons,(a1,a2)->a1.getId()-a2.getAge());
		Collections.sort(persons,(a1,a2)->a1.getName().compareTo(a2.getName()));
		System.out.println(persons);
	}
}
