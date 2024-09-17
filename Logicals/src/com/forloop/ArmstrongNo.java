package com.forloop;

public class ArmstrongNo {

	public static void main(String[] args) {
	
		int a = 1800;
		int temp = a;
		int count = 0;
		double arm = 0;
		
		for( ; temp>0; temp/=10 ) {
			count++;
		}
		
		temp = a;
		for( ; temp>0; temp/=10) {
			int digit = temp % 10;
			arm = arm + Math.pow(digit, count);
		}
		
		if (arm == a) {
			System.out.println(a + ": is Armstrong num");
		}	else {
			System.out.println(a + ": is not Armstrong num");
		}
	}

}
