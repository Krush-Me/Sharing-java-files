package com.whileloop;

public class CountDigits {

	public static void main(String[] args) {
		
		int a = 12344600;
		int count = 0;
		
		while(a > 0) {
			count++;
			a /= 10;
			
		}
		System.out.println(count);
		
	}

}
