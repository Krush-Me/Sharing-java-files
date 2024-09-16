package this_Method_Calling;

public class Student extends B {

	void m1() {
		System.out.println(this);
		int a = this.m3();
	}
	
	int m2() {
		System.out.println("m2 method");
		return 10;
	}
}
