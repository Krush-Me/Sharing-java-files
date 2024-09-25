package com.whileloop;

public class Palindrome {

	public static void main(String[] args) {
		
		int a = 12321;
		int temp = a;
		int rev = 0;
		
		while (temp > 0) {
			int digit = temp % 10;
			rev = (rev*10) + digit;
			temp /= 10;
		}
		
		if (rev == a) {
			System.out.println(a + ": is Palindrome");
		}	else {
			System.out.println(a + ": is Not Palindrome");
		}
	}

}
