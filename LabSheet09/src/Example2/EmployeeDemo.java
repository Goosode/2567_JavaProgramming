
import java.util.*;

public class EmployeeDemo {
	public static void main(String[] args) {
		//OBJ
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input employee id	: ");
		String id = scanner.nextLine();
		System.out.print("Input employee name	: ");
		String name = scanner.nextLine();
		System.out.print("Input employee salary	: ");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Input employee sales	: ");
		double sales = scanner.nextDouble();
		
		System.out.println();
		
		//OBJ
		Sales empSales = new Sales(id, name, salary, sales);
		System.out.println(empSales);
		
		System.out.printf("Total salary %,.2f baht." , (empSales.getSalary() + empSales.getCommission()));
		
		
		scanner.close();
	}

}
