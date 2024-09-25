package com.tka.sept19;

public class Task1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Paynow");
		this.payNow();
	}

	
	private void payNow() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++) {
			System.out.println("Paynow Method");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
