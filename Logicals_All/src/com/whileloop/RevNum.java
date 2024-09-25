package com.whileloop;

public class RevNum {

	public static void main(String[] args) {
		
		int a = 12345;
		int rev = 0;
		
		while(a > 0) {
			int digit = a % 10;
			rev = (rev*10) +  digit;
			a /= 10;
		}
		System.out.println(rev);			
		
	}

}
