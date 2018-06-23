package com.bridgelabz.reflection;

public class getClassObject {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("com.bridgelabz.reflection.Sample");
		System.out.println("Class Name is : "+c.getName());
		
		Sample s=new Sample();
	    c=s.getClass();
		System.out.println("Class Name is : "+c.getName());
		
		c=Sample.class;
		System.out.println(c.getName());
		
		
	}
	
}

class Sample{
}
