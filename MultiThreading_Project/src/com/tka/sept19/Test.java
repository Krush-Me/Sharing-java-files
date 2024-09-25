package com.tka.sept19;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		
		Task1 t1 = new Task1();
		Thread j1 = new Thread(t1);
		
		j1.setName("Amazon");
		j1.start();
		
		for(int i=0; i<5; i++) {
			//System.out.println(Thread.currentThread().getName());
			System.out.println("---Hello---");
			Thread.sleep(250);
		}

		System.out.println("End of main Thread...");
		
		System.out.println("No of Active Threads: " + j1.activeCount());
		
	}

}
