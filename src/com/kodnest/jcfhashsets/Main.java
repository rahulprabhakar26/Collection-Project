package com.kodnest.jcfhashsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id ;
	String name;
public Student(int id , String name) {
	super();
	this.id= id;
	this.name= name;	
}
@Override
public String toString() {
     
	return id+"-"+name;
}
}

public class Main {
public static void main(String[] args) {
	 
	Student s1= new Student(6 ,"Rahul");
	Student s2= new Student(26,"Prabhakar");
	Student s3= new Student(99 ,"Mishra");	
	Student s4= new Student(97,"Anand");
	Student s5= new Student(95 ,"Shiva");
	
	 ArrayList<Student> al= new ArrayList<Student>();
	 al.add(s1);
	 al.add(s2);
	 al.add(s3);
	 al.add(s4);
	 al.add(s5);
	 
	 System.out.println(al);
	 Collections.sort(al, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id>o2.id) {
					return -1;
					
				}else if (o1.id<o2.id){
				return 1;
				}
				
				return 0;
			}	
		});
	 System.out.println(al);
	   
}
}

//@Override
//public int compareTo(Student o) {
//	if(this.name.compareTo(o.name)>0) {
//		return -1;
//		
//	}else if (this.name.compareTo(o.name)<0){
//	return 1;
//	}
//	return 0;
//}
//@Override
//public int compare(Student o1, Student o2) {
//	if(this.name.compareTo(o.name)>0) {
//		return -1;
//		
//	}else if (this.name.compareTo(o.name)<0){
//	return 1;
//	}
//	
//	return 0;
//
