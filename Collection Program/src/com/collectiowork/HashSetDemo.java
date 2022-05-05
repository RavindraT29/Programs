package com.collectiowork;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet list = new HashSet();
	    
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("Z");
		list.add(null);
		list.add(10);
		list.add(null);  // insertion order not preserved
		System.out.println(list.add("Z"));

		System.out.println(list);
		

	}

}
