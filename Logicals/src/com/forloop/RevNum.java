package com.forloop;

public class RevNum {

	public static void main(String[] args) {

		int a = 44321;
		int rev = 0;
		
//		for(int i=1; a>0; i++) {
//			int digit = a % 10;
//			rev = (rev*10) + digit;
//			a /= 10;
//		}
		
		for( ; a>0 ; a/= 10) {
			int digit = a % 10;
			rev = (rev*10) + digit;
		}
		System.out.println(rev);
	}

}
