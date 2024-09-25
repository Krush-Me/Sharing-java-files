package com.forloop;

public class ArmstrongNo {

	public static void main(String[] args) {
	
		int a = 153;
		int temp = a;
		int count = 0;
		double arm = 0;
		
		for( ; temp>0; temp/=10 ) {
			count++;
		}
		
		temp = a;
//		for( ; temp>0; temp/=10) {
//			int digit = temp % 10;
//			arm = arm + Math.pow(digit, count);
//		}
		
		for(int i=0; i<a; i++) {
			if(temp > 0) {
				int digit = temp % 10;
				arm = arm + Math.pow(digit, count);
				temp /= 10;
			}
		}
		
		if (arm == a) {
			System.out.println(a + ": is Armstrong num");
		}	else {
			System.out.println(a + ": is not Armstrong num");
		}
	}

}
