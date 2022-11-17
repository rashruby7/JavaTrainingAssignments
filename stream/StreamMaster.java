package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMaster {
 public static void main(String[] args) {
	Integer arr[]= {2,3,1,5,6,11,19,21,8,15};
	List<Integer> myList=Arrays.asList(arr);
	//myList.stream().forEach((e)->System.out.print(e+" "));
	System.out.println();
	//myList.stream().map((e)->e*e).forEach((e)->System.out.print(e+" "));
	System.out.println();
	//myList.stram().filter((e)->e%2==0).map((e)->System.out.print(e+" "));
	
	List<String> names=new ArrayList<String>();
	names.add("Jack");
	names.add("Jill");
	names.add("John");
	names.add("Jim");
	names.add("Jim");
	names.add("Frank");
	
	
}
}
