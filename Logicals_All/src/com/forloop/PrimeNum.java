package com.forloop;

public class PrimeNum {

	public static void main(String[] args) {
		
		int a = 10;
		int count = 0;
		
		for (int i =1; i<=a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not Prime ");
		}
		
	}
}
