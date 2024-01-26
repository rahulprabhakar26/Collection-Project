package com.kodnest.jcfhashsets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add(5);
		ls.add(2);
		ls.add(6);
		ls.add(4);
		ls.add(1);
		 ls.add(null);
		 ls.add("Rahul");
		 
		 System.out.println(ls);
//		 System.out.println("Using foor loop"); 
//		  for(int i=0; i<ls.size(); i++) {
//			  System.out.print(ls.get(i)+" ");
//		  }
//		  System.out.println();
//			System.out.println("Using while Loop ");
//			int j=0;
//			while(j<al.size()) {
//				System.out.print(al.get(j)+" ");
//				j++;
//			}
//			
//			System.out.println();
//			System.out.println("Using do-while loop");
//			
//			int k=0;
//			do {
//				System.out.print(al.get(k)+" ");
//				k++;
//			}while(k<al.size());
//			
	//		System.out.println();
			
			System.out.println("Using for-each loop");
			
			for( Object i:  ls) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			System.out.println("Using Iterator");
			
			   Iterator it=ls.iterator();
			   while(it.hasNext()) {
				   System.out.print(it.next()+" ");
			   }
		 
	}

}
