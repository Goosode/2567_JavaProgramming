

public class Employee {
	//Attribute
	private String id;
	private String name;
	private double salary;
	
	//Constructor
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String id, String name) {
		this(id, name, 0);
	}
	
	//Method
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
}
