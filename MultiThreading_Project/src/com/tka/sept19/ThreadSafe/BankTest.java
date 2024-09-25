package com.tka.sept19.ThreadSafe;

public class BankTest {

	public static void main(String[] args) {
		
//		Bank u1 = new Bank();
//			u1.setName("Amazon");
//			u1.start();
//			
//		Bank u2 = new Bank();
//			u2.setName("Flipkart");
//			u2.start();
		
		Bank u1 = new Bank();		/*	Creating object	 */
		Bank u2 = new Bank();
		
		int u1p = u1.getPriority();
		int u2p = u2.getPriority();
		
		System.out.println("Default Priority: "+ u1p);
		System.out.println("Default Priority: "+ u2p);
		
//		System.out.println(u1.getPriority());
//		System.out.println(u2.getPriority());
		
		
		/*	Default Priority is 5 && 
		 * we can set Minimum Priority: 1 
		 * && Maximum Priority: 10	*/
//		u1.setPriority(7); 
//		u2.setPriority(3);
		u1.setPriority(1);		// min priority
		u2.setPriority(10);		// max priority
			
		System.out.println("\nPriority after setting: " + u1.getPriority());
		System.out.println("Priority after setting: " + u2.getPriority());
		
		u1.setName("Amazon1");		/* setting name */
		u2.setName("Flipkart2");
		
		u1.start();			/* starting run method */
		u2.start();
		
		System.out.println("\nEnd of main Thread...\n");
		
	}

}
