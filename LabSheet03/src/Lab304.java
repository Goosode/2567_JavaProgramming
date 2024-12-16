import java.util.*;

public class Lab304 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.print("Full Name: ");
		String fullName = scanner.nextLine();
		
		//variable
		String firstName = "";
		String lastName = "";
		
		//if input have not last name
		if(!fullName.contains(" ")) {
			System.out.println("Incorrect Name");
		}
		else{
			//find index of empty space
			int emptySpace = fullName.indexOf(" ");	
			firstName = fullName.substring(0, emptySpace);
			lastName = fullName.substring(emptySpace + 1, fullName.length());

					
			// System.out.println(emptySpace);
			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("Last Name: " + lastName.toLowerCase());
		}

		scanner.close();
	}
}