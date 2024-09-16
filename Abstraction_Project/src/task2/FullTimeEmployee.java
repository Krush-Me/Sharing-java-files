package task2;

public class FullTimeEmployee extends Employee {
	double salary;
	
	FullTimeEmployee(String n, int id, double s ) {
		super(n, id);
		this.salary = s;
	}

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("emp sal "+ salary);
	}
	
}
