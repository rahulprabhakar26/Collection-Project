package com.kodnest.jcfarraylist;

import java.util.ArrayList;

public class AddandSetMethod {
	public static void main(String[] args) {
		
		 ArrayList cpl = new ArrayList();
		 
		 cpl.add("Virat");
		 cpl.add("Rohit");
		 cpl.add("Sachin");
		 cpl.add("Dohni");
		 System.out.println(cpl);
		 cpl.add("Rohit");
		 System.out.println(cpl);
		 cpl.set(3, "Rahul");
		 System.out.println(cpl);
		 cpl.add(1 ,"Prabhakar");
		 System.out.println(cpl);
		 
	}

}
