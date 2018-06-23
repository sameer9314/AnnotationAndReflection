package com.bridgelabz.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class classMetaData {

	public static void main(String[] args) {
		Class c=C.class;
		
		System.out.println("********** Printing declared fields of Class C **********");
		Field[] f=c.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
		}
		
		System.out.println(" \n ********** Printing constructors of Class C **********");
		Constructor con[]=c.getDeclaredConstructors();
		for(int i=0;i<con.length;i++) {
			System.out.println(con[i]);
		}
		
		System.out.println(" \n ********** Printing methods of Class C **********");
		Method m[]=c.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]);
		}
	}
	
}
class C{
	C(){
		
	}
	
	int i=10;
	String n="Sameer";
	C(int a){}
	
	static void m1() {
		
	}
	
	static void  m2() {
		
	}
}