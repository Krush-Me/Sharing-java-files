package com.tka.sep9;

public interface A {

	public static final int a = 1;
	static final int b = 2;
	final int c = 3;
	int d = 4;
	
	public abstract int m1();
	
	abstract String m2();
	
	Student m3();
	
	public static void skipEMI() {
		System.out.println("Non abstract method in interface");
	}
	
	public default void m4() {
		System.out.println("default m4 method");
	}
}
