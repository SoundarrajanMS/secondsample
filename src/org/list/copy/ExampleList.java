package org.list.copy;

import java.util.*;
import java.util.*;

public class ExampleList {
	public static void main(String[] args) {
		List <Integer> ex = new  ArrayList<>();
		
		ex.add(10);
		ex.add(20);
		ex.add(40);
		ex.add(60);
		ex.add(50);
		
		System.out.println(ex);
		
		
		ex.set(3, 50);
		System.out.println(ex);
		
		ex.remove(4);
		System.out.println(ex);
		
		
		for(int i=0;i<ex.size();i++) {
		
		System.out.println(ex.get(i));}
		
System.out.println("\n");

		for (Integer j : ex) {
			System.out.println(j);
			System.out.println("hai");
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
	}

}
