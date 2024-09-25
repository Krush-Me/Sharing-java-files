package q2;

public class Test {

	public static void main(String[] args) {

		B b1 = new B();
		b1.m1();
		
		A a1 = new B();		// Dynamic dispatch
			a1.m1();
	}

}
