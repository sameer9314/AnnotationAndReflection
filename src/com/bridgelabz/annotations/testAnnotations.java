package com.bridgelabz.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Sameer{
	String name();
}

class S{
	@Sameer(name="sameer")
	public  void m() {
		System.out.println("First Annotaion Method");
	}
}
// Applying annotation
class Hello {
	@MyAnnotation(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}

// Accessing annotation
public class testAnnotations {
	public static void main(String args[]) throws Exception {

		Class h =Class.forName("com.bridgelabz.annotations.Hello");
		Method m = h.getMethod("sayHello");
		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		
		System.out.println("value is: " + manno.value());
		
		S h1=new S();
		Method m1=h1.getClass().getMethod("m");
		Sameer s=m1.getAnnotation(Sameer.class);
		System.out.println("Method Annotation name : "+s.name());
		h1.m();
	}
}