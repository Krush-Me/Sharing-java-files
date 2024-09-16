package Max_num;

public class Maximum_no {

	void maxNum(int jay, int viru) {
		
		if (jay > viru) {
			System.out.println("Jay will Pay bill");
		}	else {
			System.out.println("Viru will Pay bill");
		}
	}
	
	int MaxNo (int a, int b) {
		if (a > b) {
			System.out.println("a is Max No");
			return a;
		}	else {
			System.out.println("b is Max No");
			return b;
		}
	}
	
	boolean Max_num (int a, int b) {
		if (a > b) {
			return true;
		}	else {
			return false;
		}
	}
}
