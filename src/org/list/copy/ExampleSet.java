package org.list.copy;

import java.util.*;

public class ExampleSet {
	public static void main(String[] args)  {
		Set <Integer>se = new HashSet();
		System.out.println("No  class of set(interface) does not allows duplcates");
		System.out.println("\n"+"\n");
	  se.add(10);
	  se.add(30);
	  se.add(40);
	  se.add(0);
	  se.add(20);
	  se.add(20);
	  System.out.println("Below is Random output,so its is HashSet(class)");
	  System.out.println("\n");
	  System.out.println(se);

	  
	  
	  Set <Integer>si = new LinkedHashSet();
	  
	  si.add(10);
	  si.add(30);
	  si.add(40);
	  si.add(0);
	  si.add(20);
	  si.add(20);
	  si.add(50);
	  si.add(70);
	  System.out.println("\n");
	  System.out.println("Below is insertion output,so its is LinkedHashSet(class)");
	  System.out.println("\n");
	 // si.addAll(se);
	 // System.out.println(si);
	 // System.out.println("\n");
	  si.retainAll(se);
	  System.out.println(si);
	  
	  
	  System.out.println(si);
	  
	  Set<Integer> st =new TreeSet();
	  st.add(10);
	  st.add(15);
	  st.add(35);
	  st.add(0);
	  st.add(20);
	  st.add(20);
	  System.out.println("\n");
	  System.out.println("Below is Asscending order output,so its is TreeSet(class)");
	  System.out.println("\n");
	  System.out.println(st);
	  
	 
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
