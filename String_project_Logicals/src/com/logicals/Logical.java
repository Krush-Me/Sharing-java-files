package com.logicals;

public class Logical {

	public static String m1(String str) {
		for (int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		return str;
	}
	
}
