package com.forloop;

public class BasicFor {

	public static void main(String[] args) {

		int a = 1;
		int count = 0;
		
		for(int i=1; i <= a; i++) {
			if ( a % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("is Prime No");
		} else {
			System.out.println("Not Prime ");
		}
		
		
		
	}

}
