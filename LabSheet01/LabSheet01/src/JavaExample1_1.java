import java.util.*;

public class JavaExample1_1 {

	public static void main(String[] args) {
		// input data from keyboard
		Scanner scan = new Scanner(System.in);

		// using next()
		System.out.print("Enter your first name(using next): ");
		String firstName = scan.next();
		scan.next();

		// using nextLine()
		System.out.print("Enter your last name(using nextLine): ");
		String lastName = scan.nextLine();

		// display
		System.out.println("\n-----OutPut-----");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);

		scan.close();
	}

}
