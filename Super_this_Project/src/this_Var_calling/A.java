package this_Var_calling;

public class A {
	int p = 10;
	
	void m1() {
		int p = 90;
		
		System.out.println(this);
		
		System.out.println(this.p);
		
		System.out.println(p);
		
		System.out.println(p + this.p);
	}
}
