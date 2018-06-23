package com.bridgelabz.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class callPrivateMethod {
	static A   instanceTwo;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, ReflectiveOperationException {
		Class c=A.class;
		
		Constructor[] constructors;
		constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            //Below code will destroy the singleton pattern
            constructor.setAccessible(true);
            instanceTwo   = (A) constructor.newInstance();
            break;
        }
        
        Object o1 = c.getConstructor(int.class);

		Method m[]=c.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
		System.out.println(m[i]);
		}
        
        Object o=instanceTwo;
		Method m1=c.getDeclaredMethod("message",null);
		m1.setAccessible(true);
		m1.invoke(o,null);
		
		m1=c.getDeclaredMethod("message1", new Class[] {int.class});
		m1.setAccessible(true);
		m1.invoke(o,4);
		
		
	}
}
class A{
	private A() {
		System.out.println("Calling Private Constructor");
	}
	 A(int a) {
		System.out.println("Calling Parameterized Private Constructor");
	}
	private void message() {
		System.out.println("Calling private method ");
	}
	private void message1(int n) {
		System.out.println("Calling Parameterized Private Method");
	}
}	
