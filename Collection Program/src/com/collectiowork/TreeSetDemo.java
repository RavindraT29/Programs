package com.collectiowork;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> values= new TreeSet<>();
		System.out.println(values.add(5));
		System.out.println(values.add(6));
		System.out.println(values.add(9)); 
		System.out.println(values.add(6));  
		
	  for(int i: values) {
		  
		  System.out.println(i);
	  }


	}

}
