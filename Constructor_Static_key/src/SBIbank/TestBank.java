package SBIbank;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(SBIBank.balance);
		
		SBIBank user1 = new SBIBank();	// obj 1
				user1.withdraw(200);
				System.out.println(user1.balance);
				
		SBIBank user2 = new SBIBank();	// obj2
				user2.withdraw(200);
				System.out.println(user2.balance);
				
		
		
	}
}
