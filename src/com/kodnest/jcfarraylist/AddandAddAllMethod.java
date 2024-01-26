package com.kodnest.jcfarraylist;

import java.util.ArrayList;

public class AddandAddAllMethod {
	public static void main(String[] args) {
		
		ArrayList s= new ArrayList();
		   s.add("Rahul");
		   s.add("Ujwal");
		   s.add("Prabhakar");
		   
		  
		  ArrayList t= new ArrayList();
		  t.add("Shiva");
		  t.add("Gajendar");
		  t.add("Punit");
		  System.out.println(s);
		  System.out.println(t);
		  
		  
		  ArrayList e= new ArrayList();
		  
		  e.add(s);
		  e.add(t);
		  System.out.println(e);
		  ArrayList e1= new ArrayList();
		    e1.addAll(s);
		    e1.addAll(t);
		    
		    System.out.println(e1);
		  
		  
	}

}
