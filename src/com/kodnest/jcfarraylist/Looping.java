package com.kodnest.jcfarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Looping {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);

	System.out.println(al.size());
	System.out.println("Using for loop ");
	for(int i=0; i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	System.out.println("Using while Loop ");
	int j=0;
	while(j<al.size()) {
		System.out.print(al.get(j)+" ");
		j++;
	}
	
	System.out.println();
	System.out.println("Using do-while loop");
	
	int k=0;
	do {
		System.out.print(al.get(k)+" ");
		k++;
	}while(k<al.size());
	
	System.out.println();
	
	System.out.println("Using for-each loop");
	
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
