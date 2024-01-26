package com.kodnest.jcfarraylist;

class Student{
	int age;
	String name;
	public Student(int age , String name) {
		this.age=age;
		this.name=name;
		
	}
	//overriding the toString()
	
	@Override
	public String toString() {
		
		return "Student{name:"+name+",age:"+age+"}";
	}
	
}


public class Sorting {
	public static void main(String[] args) {
     Student s= new Student(20,"Rahul");
     Student s1= new Student(23,"Ujwal");
     System.out.println(s);
     System.out.println(s1);
     

	}

}
