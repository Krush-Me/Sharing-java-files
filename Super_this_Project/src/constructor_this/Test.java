package constructor_this;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student(1, "viru", 88);
		//s1.display();
		System.out.println("memory of s1 obj: " + s1);
		
		System.out.println("-----------------------");

		Student s2 = new Student(2, "jay", 50);
		//s2.display();
		System.out.println("memory of s2 obj: " + s2);
	}

}
