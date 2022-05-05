package com.collectiowork;

import java.util.LinkedList;

public class LinekedList1 {

	public static void main(String[] args) {
		
		LinkedList  list = new LinkedList();
		
		list.add("Ravi");
		list.add("Rahul");
		list.add("Mukesh");
		list.add(2, "Vikas");   // add 2nd index Vikas
		list.addFirst("Tadvi");   // addfirst element
		System.out.println(list.get(1));  // get first index element
		
		
		System.out.println(list);

	}

}
