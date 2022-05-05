package com.collectiowork;

import java.util.Vector;

public class Vector1 {
	
	public static void main(String args[]) {
		
		Vector list = new Vector();
		
		System.out.print(list.capacity());  // vector initial capacity 10
		
		for(int i=0;i<=10;i++) {
			
			list.addElement(i);
			
		}
		System.out.println(list.capacity());
		list.add("A");
		list.add("A");
		list.add(null);
		System.out.println(list.capacity());
		System.out.println(list);
	}

}
