package com.forloop;

public class CountDigits {

	public static void main(String[] args) {
		
		int a = 12345678;
		int count = 0;
		
		for(int i=1; a>0; i++) {
			count++;
			a /= 10;
		}
		System.out.println(count);
	}

}
