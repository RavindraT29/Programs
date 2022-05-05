package com.collectiowork;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
	
		 ArrayList list= new ArrayList();
		 
		 list.add("A");
		 list.add(null);
		 list.add(10);
		 list.add("A");
		 list.add(1, "ravi");  // add value
		 list.remove(1);
		 
		 System.out.println(list);
		 

	}

}
