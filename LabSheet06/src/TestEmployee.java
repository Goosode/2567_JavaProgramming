
public class TestEmployee {

	public static void main(String[] args) {
		//Object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//Set employee details
		emp1.SetEmployeeDetails("John", 45, 20);
		emp2.SetEmployeeDetails("Jane", 38, 25);
		
		//Display employee details
		System.out.println("Employee 1 Details:");
		emp1.DisplayEmployeeDetails();
		
		System.out.println("Employee 2 Details:");
		emp2.DisplayEmployeeDetails();
	}

}
