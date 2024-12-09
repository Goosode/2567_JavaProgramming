import java.util.*;

public class Lab304 {

	public static void main(String[] args) {
		//Not finished
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.print("Full Name: ");
		String fullName = scanner.nextLine();
		
		//variable
		String firstName = "";
		String lastName = "";
		int emptySpace = 0;
		
		//if input have not last name
		if(!fullName.contains(" ")) {
			System.out.println("Incorrect Name");
		}
		
		for(int i = 0; i < fullName.length(); i++) {
			if(fullName.isBlank()) {
				emptySpace += i;
		}
			
			firstName = fullName.substring(0);
			lastName = fullName.substring(fullName.length()-1);
		}
		
		System.out.println(emptySpace);
		System.out.println(firstName);
		System.out.println(lastName);
		
		scanner.close();
	}

}
