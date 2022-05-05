package com.collectiowork;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

	public static void main(String[] args) {
       
		Vector list = new Vector();
		for(int i=0; i<=10;i++) {
			list.add(i);
			
		}
		System.out.println(list);
		
		Enumeration e = list.elements();
		while(e.hasMoreElements()) {
			
			Integer I =(Integer)e.nextElement();
			if( I%2==0) {
				
				System.out.println(I);
				}
			System.out.println(list);
			
		}
	}

}
