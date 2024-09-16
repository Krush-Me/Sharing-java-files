package max_min;

public class MaxMin {

	public int checkMaxMin(int a, int b, int c) {
		
		if (a > b && a > c) {
//			return "a is max";
			System.out.println(a +" is max");
			return a;
		} else if (b > a && b > c) {
			System.out.println(b + " is max");
			return b;
//			return "b is max";
		} else if (c > a && c > b) {
			System.out.println(c + "  is max");
			return c;
//			return "c is max";
		}
		
		
		return c;
		
		
	}
}
