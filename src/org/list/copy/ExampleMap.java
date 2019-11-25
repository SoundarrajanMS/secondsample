package org.list.copy;

import java.util.*;
import java.util.Map.Entry;

public class ExampleMap {
	public static void main(String[] args) {
		Map <Integer,String> mp = new HashMap();
		
		mp.put(1,"a");
		mp.put(2,"b");
		mp.put(3,"c");
		mp.put(4,"d");
		mp.put(5,"a");
		mp.put(7,"c");
		mp.put(6,"e");
		mp.put(3,"null");
		
		mp.put(null,"g");
		mp.put(null, "h");
		mp.put(null,"null");
		
		
		
		System.out.println(mp);

		String s = mp.get(3);
		System.out.println(s);
		
		Collection<String> v = mp.values();
	
	System.out.println(v);
	
	
	Set<Integer> i = mp.keySet();
		System.out.println(i);
		
		Set<Entry<Integer, String>> l = mp.entrySet();
	
		
		for (Entry<Integer, String> m :l) 
			
		
			
			System.out.println(m.getValue());
		
	
		
			
		}
		
	}
		
		
	

