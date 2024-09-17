package com.whileloop;

public class PrimeNum {

	public static void main(String[] args) {
		
		int a = 19;
		int i = 1;
		int count = 0;
		
		while(i <= a) {
			if(a % i == 0) {
				count++;
			}
			i++;
		}
		
		if(count == 2) {
			System.out.println(a + " is Prime number");
		} else {
			System.out.println(a + " is Not Prime ");
		}

	}

}
