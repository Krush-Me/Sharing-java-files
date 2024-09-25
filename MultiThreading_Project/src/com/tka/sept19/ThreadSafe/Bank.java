package com.tka.sept19.ThreadSafe;

public class Bank extends Thread {
	private static int balance = 1800;
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			payNow(200);
		}
	}

	private static synchronized void payNow(int i) {
		System.out.println(Thread.currentThread().getName());
		if(balance >= i) {
			balance = balance - i;
			System.out.println(balance );
		} else {
			System.out.println("Insuffiecient Balance...");
		}
//		System.out.println(balance);
		
		for(int j=1; j<=2; j++) {
			System.out.println("JBK...");
		}
		System.out.println();
	}
	
}
