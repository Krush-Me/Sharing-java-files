package multiple_Inheritance_problem;

public class Test {

	public static void main(String[] args) {
		
		 A a1 = new A();
		 	a1.m1();
		 	System.out.println(a1.hashCode());

		 I1 i1 = new A();	// dynamic dispatch
		 
		 
		 
		 
		 B b1 = new B();
		 	b1.m1();
	}

}
