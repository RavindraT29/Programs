package intarnalhashmap;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	public static void main(String[] args) {;

		/*
		String s1="FB"; // SASH COLLISON
		String s2="Ea";
		System.out.println(s1.hashCode()+"  "+s2.hashCode());
		*/
		
	
		Map<String,Integer> map= new HashMap<>();
		/*
		map.put("aaa", 1);
		map.put("aaa", 2);
		map.put("aaa", 3);
		*/
		
		//map.put(s1, 1);
		//map.put(s2, 2);
		
		//map.put("bb", 1); // dublicates key
	   // map.put("bb", 2);
	    
	                      // same key with different value
       map.put(null, 1);    // NULL key 0 baketes
	}

}
