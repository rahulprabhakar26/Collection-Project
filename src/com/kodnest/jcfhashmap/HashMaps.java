package com.kodnest.jcfhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class HashMaps {
	public static void main(String[] args) {
		
		LinkedHashMap <Integer,String> hashMap= new LinkedHashMap<Integer,String>();
		
		hashMap.put(1, "Java");
		hashMap.put(5, "HTML");
		hashMap.put(3, "CSS");
		hashMap.put(7, "JS");
		 System.out.println(hashMap);
		 
	
		
	}
	

}
