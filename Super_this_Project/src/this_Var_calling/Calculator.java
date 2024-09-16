package this_Var_calling;

public class Calculator {

	
	int addTwo(int a, int b) {
		return a+b;
	}
	
	void avg(int a, int b) {
		System.out.println("Memory Add of avg method");
		System.out.println(this);
		
		int addition = addTwo(a,b);
		System.out.println(addition/2);
		
		System.out.println("---------------------");
	}
	
}
