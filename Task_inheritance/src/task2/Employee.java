package task2;

public class Employee {

	String name;
	int employeeID;
	
	Employee(String n, int id){
		this.name = n;
		this.employeeID = id;
	}
	
	void displayDetails() {
		System.out.println("emp name: "+ name);
		System.out.println("emp id: "+ employeeID);
	}
	
}
