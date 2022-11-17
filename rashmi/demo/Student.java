package com.rashmi.demo;

public class Student {

	
	private int id;
	private String Name;
	private String email;
	
	private int age;
	private static String teacher;
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public Student(int id, String name, String email, int age) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.age = age;
	}
	public Student(int id, String name, String email, int age,String teacher) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.age = age;
		this.teacher=teacher;
	}
	 
	
	public static String getTeacher() {
		return teacher;
	}

	public static void setTeacher(String teacher) {
		Student.teacher = teacher;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Student s1[]=new Student[3];
		s1[0]=new Student(1,"rashmi","rashmi@gmail.com",23);
		s1[1]=new Student(2,"sujata","sujata@gmail.com",25);
		s1[2]=new Student(3,"nikhil","nikhil@gmail.com",23);
		System.out.println(s1[1].getEmail());
	}
	
}
