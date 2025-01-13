
public class Employee {
	//attributes
	private String name;
	private int hoursWorked;
	private float hourlyRate;
	
	//method
	public void SetEmployeeDetails(String empName, int hours, float rate) {
		name = empName;
		hoursWorked = hours;
		hourlyRate = rate;
	}
	
	public float CalculateSalary() {
		float salary = hoursWorked * hourlyRate;
		
		if(hoursWorked > 40) {
			salary = salary + (salary * 0.1f);
		}
		
		return salary;
	}
	
	public void DisplayEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Hourly Rate: " + hourlyRate);
		System.out.println("Total Salary: " + CalculateSalary());
		System.out.println();
	}
}