package com.whileloop;

public class Armstrong {

	public static void main(String[] args) {
		
		int a = 1534;
		
		int temp = a;
		int count = 0;
		double arm = 0;
		
		while (temp > 0) {
			count++;
			temp/=10;
		}
		
		temp = a;
		
		while(temp > 0) {
			int digit = temp % 10;
			arm = arm + Math.pow(digit, count);
			temp/=10;
		}
		
		if (arm == a) {
			System.out.println("Armstrong");
		} else {
			System.out.println("not Armstrong");
		}

	}

}
