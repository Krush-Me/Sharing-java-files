
public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		System.out.println(c1.price);
		System.out.println(c1.brand);
		// Method Calling
		c1.addThree(12, 19.5, -5);
		c1.addThree(10, 20.05, -30);
		
	}
}
