package com.ravi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashmapKeyValue {

	public static void main(String[] args) {
		HashMap<Integer, String> list= new HashMap<Integer,String>();
	         list.put(29, "Ravindra");
	         list.put(34, "Rahul");
	         list.put(10, "Mukesh");
	       // not allowed Duplicates
	
		Iterator<Integer> itr=list.keySet().iterator();
		System.out.println("Before Sorting");
		while(itr.hasNext()) {
			int key=(int)itr.next();
			System.out.println("Roll NO:"+key+" name:"+list.get(key));
		}
		System.out.println("/n");
		Map<Integer,String> map = new HashMap<Integer, String>(); 
		System.out.println("After sorting");
		
		TreeMap<Integer,String> treemap= new TreeMap<Integer,String>(list);
		
		Iterator itr1=treemap.keySet().iterator();
		
		while(itr1.hasNext()) {
			int key=(int)itr1.next();
			System.out.println("Roll No:"+key+" name:"+list.get(key));
		}
		

	}

}
