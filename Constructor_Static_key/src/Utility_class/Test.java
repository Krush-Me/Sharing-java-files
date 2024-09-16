package Utility_class;



public class Test {

	public static void main(String[] args) {
		
		double res = UtilityCalculator.addTwo(10, 22.5);
		System.out.println("Addition: " + res);
		
		double res2 = UtilityCalculator.subTwo(10,5);
		System.out.println("Sub :" + res2);
	
		double r1 = Math.sqrt(2);
		System.out.println(r1);
		
		System.out.println(Math.pow(5, 2));
		
		System.out.println(Math.max(50.5, 20));
	}

}
