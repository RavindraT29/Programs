package com.interator;

import java.util.HashMap;
import java.util.Map;

public class Java8EachoDemo {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "Sandeep");
		map.put(2, "Ravindra");
		map.put(3, "Manoj");
		/*
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
         System.out.println("Key="+entry.getKey());
         System.out.println("Value="+entry.getValue());
		}
		*/
		
		map.forEach((k,v)->System.out.println("Key"+k+"Value="+v));
	}

}
