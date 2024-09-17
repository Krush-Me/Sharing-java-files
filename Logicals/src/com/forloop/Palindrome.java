package com.forloop;

public class Palindrome {

	public static void main(String[] args) {

		int a = 1233212;
		int temp = a;
		int rev = 0;

		for ( ; temp > 0; temp /= 10) {
			int digit = temp % 10;
			rev = (rev * 10) + digit;
		}
		if (rev == a) {
			System.out.println(a+ ": Palindrome");
		} else {
			System.out.println(a+ ": Not Palindrome");
		}
	}

}
