import java.util.*;

public class SalespersonSalary_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Declare constants
		 final float COMMISSION_RATE = 0.15f;
		 final int SENTINEL = -1; // Terminating value for input
		 final float BASE_SALARY = 1000;
		 
		 // Declare variables
		 int sales; // Input gross sales
		 float salary; // Salary to be computed
		 
		 while(true) {
			 System.out.print("Enter gross sales for the saleperson(or -1 to exit): ");
			 sales = scanner.nextInt();
			 
			 if(sales == SENTINEL) {
				 System.out.println("bye");
				 break;
			 }
			 
			 salary = BASE_SALARY + (sales * COMMISSION_RATE);
			 System.out.printf("The saleperson's salary is : $%.2f", salary);
			 System.out.println("");
		 }
		 System.out.println("All saleperson's salaries have beed computed.");
		 
	}

}
