package SBIbank;

public class SBIBank {

	static int balance = 1000; // if we dont make static bal will remain 1000
	
	void withdraw(int amt) {
		if (amt < balance) {
			balance = balance - amt;
		} else {
			System.out.println("Insuffiecient Balance");
		}
	}
}
