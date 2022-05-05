package com.collectiowork;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
       Stack list= new Stack<Object>();
       list.push("A");  //add element
       list.push("B");
       list.push("C");
       
      list.remove(1);  // remove element
       System.out.println(list.search("B"));  // search element
       System.out.println(list); 
	}

}
