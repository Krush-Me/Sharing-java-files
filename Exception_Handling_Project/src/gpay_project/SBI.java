package gpay_project;

public class SBI extends Gpay{
	private int balance = 1000;
	
	@Override
	public void payNow(int amt) throws ArithmeticException{
		System.out.println("SBI payNow method:");
		
		balance = balance - amt;
		System.out.println(balance);
		
		System.out.println(10 / 0);
		
		//System.out.println(20 / 2);
	}
	
}
