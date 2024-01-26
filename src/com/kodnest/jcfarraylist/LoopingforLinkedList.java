package com.kodnest.jcfarraylist;

import java.util.Iterator;
import java.util.LinkedList;



public class LoopingforLinkedList {
	public static void main(String[] args) {
	
	LinkedList ll = new LinkedList();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	 System.out.println("Using for-each loop");
	for(Object ob:ll) {
		System.out.print(ob+" ");
	}
	 System.out.println();
	 System.out.println("Using Iterator");
	 
	 Iterator it = ll.iterator();
	 while(it.hasNext()) {
		 System.out.print(it.next()+" ");
	 }
	 
	
	}
}
