package com.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    int id;
    String name;
    int age;
    
    public Student(int id , String name , int age) {
        this.id=id;this.name=name;this.age=age;
    }



   @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }



@Override
public int hashCode() {
	return Objects.hash(age, id, name);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return age == other.age && id == other.id && Objects.equals(name, other.name);
}



@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.age-o.age;
}
   

   
    
    
}
class MyClass<T> {
    T a;



   public MyClass(T a) {
        this.a = a;
    }



   void printValue() {
        System.out.println(a);
    }
}


public class GenericMaster {
	
	public static boolean contains5Vowels(String str)
	{
		Set<Character> s1=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u')
				s1.add(str.charAt(i));
		}
		return false;
	}
    public static void main(String[] args) {
        Set<Student> sarr=new TreeSet<Student>();
        
        sarr.add(new Student(1 , "amit" , 21));
        sarr.add(new Student(1 , "amit" , 21));
        sarr.add(new Student(2 , "neha" , 22));
        sarr.add(new Student(2 , "neha" , 22));
        sarr.add(new Student(1 , "amit" , 21));
        for(Student a:sarr)
        {
        	System.out.println(a+" ");
        	
        }
        


   }
}
