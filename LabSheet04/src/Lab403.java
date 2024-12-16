import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		//input object
		Scanner scanner = new Scanner(System.in);

		//variable
		String fullName;
		String firstName;
		
		System.out.println("Please enter your name, separated by a space.");
		System.out.print(":");
		fullName = scanner.nextLine();
		
		int space = fullName.indexOf(' '); //find empty space from full name.
		firstName = fullName.substring(0, space);
		
		System.out.println(AbbreviatName(fullName) + firstName);
		
		scanner.close();
	}//Main end

	public static String AbbreviatName(String fullName) {
		String initialLetterString = "";
		
		for(int i = 0; i < fullName.length(); i++) {
			//if charArr is empty space charArr + 1
			if(fullName.charAt(i) == ' ') {
				initialLetterString = (initialLetterString + fullName.charAt(i + 1)).toUpperCase();
				initialLetterString = initialLetterString + ".";
			}
		}
		
		return initialLetterString;
	}

}
