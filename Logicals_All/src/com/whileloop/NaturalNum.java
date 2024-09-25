package com.whileloop;

public class NaturalNum {

	public static void main(String[] args) {

		int num = 10;
		int i = 0;
		int sum = 0;
		
		while(i <= num) {
			sum = sum + i;
			i++;
		}

		System.out.println(sum);
	}

}
