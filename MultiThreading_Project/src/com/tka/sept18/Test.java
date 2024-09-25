package com.tka.sept18;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		
		Task1 t1 = new Task1();
			t1.setName("Amazon 1");
			t1.start();
			
		Task1 t2 = new Task1();
			t2.setName("Myntra 2");
			t2.start();
			
		Task2 t3 = new Task2();
				t3.start();
			
		for(int i=0; i<5; i++) {
		System.out.println("---Hello---");
		Thread.sleep(500);
		}
		System.out.println("end of main Method");
	}

}
