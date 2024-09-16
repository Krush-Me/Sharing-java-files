package com.sep3;

public class A {
	
	public A() {
		System.out.println("zero para construcor");
	}

	public A(String s) {
		System.out.println("one para constructor");
	}
	
	void m1() {
		System.out.println(111);
	}
	
	// method overloading
	void m1(int a) {
		System.out.println(a*111);
	}

}
