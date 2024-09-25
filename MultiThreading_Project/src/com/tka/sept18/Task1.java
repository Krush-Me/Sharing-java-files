package com.tka.sept18;

public class Task1 extends Thread {

	@Override
	public void run() {
		this.m1();
	}
	
	private void m1() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++) {
		System.out.println("Krusham ");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println("end of run method");
	}
}
