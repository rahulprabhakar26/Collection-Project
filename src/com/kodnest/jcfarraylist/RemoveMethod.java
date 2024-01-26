package com.kodnest.jcfarraylist;

import java.util.ArrayList;

public class RemoveMethod {
	public static void main(String[] args) {
		
	 ArrayList cpl = new ArrayList();
		 
		 cpl.add("Virat");
		 cpl.add("Rohit");
		 cpl.add("Sachin");
		 cpl.add("Dohni");
		 System.out.println(cpl);
		 cpl.add("Rohit");
		 System.out.println(cpl);
		  cpl.remove("Rohit");
		  System.out.println(cpl);
		  cpl.remove(1);
		  System.out.println(cpl);
		
	}

}
