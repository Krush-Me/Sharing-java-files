package q1;

/*	WAP to explore InterCommunication concept	*/

public class InterCom_Method {
	
	/* Q 1 */
	
	int a;
	int b;
	
	void m1() {
		InterCom_Method im = new InterCom_Method();
			im.addTwo(a, b);
	}

	double addTwo(int a,int b) {
		double add = a + b;
		return add;
	}
	
	
	/* Q 1 */
	
	
	/*	Best way -> */
	public static int addNum(int x, int y) {
		return x + y;
	}
	
}
