package com.tka.sept18;

public class Task2 extends Thread {

	@Override
	public void run() {
		this.m1();
	}
	
	private void m1() {
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Task2 m1");
		
		System.out.println("end of run method - task2");
	}
	
}
