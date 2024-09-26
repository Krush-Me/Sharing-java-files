package gpay_project;

public class Test {

	public static void main(String[] args) {
		
		Gpay obj1 = new SBI();
		
		try {
			obj1.payNow(200);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
