package constructor_this;

public class Student {

	 private int roll;
	 private String name;
	 private int marks;
	 
	 Student() {
		 System.out.println("memory of 0 para: " + this);
		 System.out.println("0 para constructor");
	 }
	 
	 Student(int roll) {
		 this();
		 this.roll = roll;
		 System.out.println("memory of 1 para: " + this);
		 
		 System.out.println("1 para constructor");
	 }
	 
	 Student(int roll, String name) {
		 this(roll);
		 this.name = name;
		 System.out.println("memory of 2 para: " + this);
		 
		 System.out.println("2 para constructor");
	 }
	 
	 Student(int roll, String name, int marks) {
		 this(roll,name);
		 this.marks = marks;
		 System.out.println("memory of 3 para: " + this);
	
		 System.out.println("3 Parameterized Constructor");
	 }
	 

//	 void display() {
//		 System.out.println(" Student roll: " + roll);
//		 System.out.println(" Student name: " + name);
//		 System.out.println(" Student marks: " + marks);
//		 System.out.println("roll + marks: " + (roll + marks));
//		 System.out.println("--------------------");
//	 }
	
}
