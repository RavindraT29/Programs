package com.collectiowork;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
        Hashtable h = new Hashtable();
         h.put(new Temp(5),"A");
         h.put(new Temp(2),"C");
         h.put(new Temp(6),"D");
         h.put(new Temp(15),"E");
         h.put(new Temp(23),"F");
         h.put(new Temp(16),"A");
         
        System.out.println(h);
        
	}

}
