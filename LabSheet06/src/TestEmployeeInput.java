import java.util.*;

public class TestEmployeeInput {

	public static void main(String[] args) {
		//Object
		Scanner scanner = new Scanner(System.in);
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(); 
		
		//=============================input for first employee details=============================
		System.out.println("Enter detail for Employee 1:");
		System.out.print("Name: ");
		String empName1 = scanner.nextLine();
		
		System.out.print("Hours Worked: ");
		int empHoursWorked1 = scanner.nextInt();
		
		System.out.print("Hourly Rate: ");
		float empHourlyRate1 = scanner.nextFloat();
		
		//set details 1
		emp1.SetEmployeeDetails(empName1, empHoursWorked1, empHourlyRate1);
		
		//display details 1
		System.out.println("Employee 1 Details:");
		emp1.DisplayEmployeeDetails();
		
		scanner.nextLine(); //use for consume leftover newline
		
		//=============================input for second employee details=============================
		System.out.println("Enter detail for Employee 2:");
		System.out.print("Name: ");
		String empName2 = scanner.nextLine();
		
		System.out.print("Hours Worked: ");
		int empHoursWorked2 = scanner.nextInt();
		
		System.out.print("Hourly Rate: ");
		float empHourlyRate2 = scanner.nextFloat();
		
		//set details 2
		emp2.SetEmployeeDetails(empName2, empHoursWorked2, empHourlyRate2);
		
		//display details 2
		System.out.println("Employee 2 Details:");
		emp2.DisplayEmployeeDetails();
		
		
		scanner.close();//close scan
	}

}
