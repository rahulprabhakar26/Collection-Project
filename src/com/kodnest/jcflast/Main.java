package com.kodnest.jcflast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	public static void main(String[] args) {
		
		 CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		   al.add(20);
		   al.add(30);
		   al.add(40);
		   al.add(50);
//		   for(int i=0; i<al.size(); i++) {
//			   System.out.println(al.get(i));
//			   al.add(99);
//	   }
//			   int i=0;
//			   while(i<al.size()) {
//				   System.out.println(al.get(i));
//				   i++;
//				   al.add(99);
//			   }
//			 
//		   for(Object o:al) {
//			   System.out.println(o);
//			   al.add(99);
//			   
//		   }
		   
		   Iterator it = al.iterator();
		   while(it.hasNext()) {
			   System.out.println(it.next());
			   al.add(99);
		   }
		   System.out.println(al);
		   }
		   
	}


