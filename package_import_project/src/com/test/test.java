package com.test;

import com.amazon.mobiles.apple.*;
import com.amazon.mobiles.B;

public class test {

	public static void main(String[] args) {
		
		Apple15 a1 = new Apple15();
		System.out.println(a1.price);
		a1.m1();
		
		B b1 = new B();
		System.out.println(b1.a);
		b1.m2();
				
		com.amazon.mobiles.apple.B b2 = new com.amazon.mobiles.apple.B();
		System.out.println(b2.b);
		b2.m3();
	}
}
