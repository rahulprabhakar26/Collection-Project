package com.kodnest.jcfhashsets;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main1 {
	public static void main(String[] args) {
		
		 TreeSet al = new TreeSet();
		 al.add(10);
		 al.add(20);
		 al.add(10);
		// al.add(null);
		//al.add("Rahul");
		 
		 //ArrrayList - All      
		 //LinkedList - All
		 // ArrayDeque - duplicate = yes
		 //            - null = no
		 //            - ooI = yes
		 //            - heterogeneous = yes
		 //            - for loop = no
		 
		 
		 //PriorityQue D=yes
		   //          null = no
//		              OOI= no
//		            	HG= no
//		            	for loop= no
//		            	for-each = yes
//		            	Iterator = yes
		 
		 
		// treeset D= no
//				 null= no
//				Hg= no
//				OOI= no
//				for loop= no
		 //     for- each = Yes
		 //      Iterator = yes
		 //      element in sorted = yes
		 
		 
		 
		 
		 
		 System.out.println(al);
		 System.out.println();
		 
	//	 System.out.println("Using foor loop"); 
//		  for(int i=0; i<al.size(); i++) {
//			  System.out.print(al.get(i)+" ");
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
			
		//	System.out.println("Using for-each loop");
			
			for( Object i:  al) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			System.out.println("Using Iterator");
			
			   Iterator it=al.iterator();
			   while(it.hasNext()) {
				   System.out.print(it.next()+" ");
			   }
		 
	}

}
