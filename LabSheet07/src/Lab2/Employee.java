
//=================================== Lab2 ===================================
public class Employee{
	//======Attribute======
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	//======Constructor======
	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}//employee end
	
	
	//======Method======
	public int getId() {
		return this.id;
	}//getId end
	
	public String getFirstName() {
		return this.firstName;
	}//getFirstName end
	
	public String getLastName() {
		return this.lastName;
	}//getLastName end
	
	public String getName(){
		return this.firstName + " " + this.lastName;
	}//getName end
	
	public int getSalary() {
		return this.salary;
	}//getSalary end
	
	public void setSalary(int salary) {
		this.salary = salary;
	}//setSalary end
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}//getAnnualSalary end
	
	public int raiseSalary(int percent) {
		return this.salary = this.salary + (this.salary * percent/100);
	}//raiseSalary end
	
	public String toString() {
		return "Employee[id=" + this.id + ",name=" + getName() + ",salary=" + this.salary + "]";
	}//toString end
}
