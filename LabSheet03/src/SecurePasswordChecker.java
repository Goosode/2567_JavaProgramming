import java.util.*;

public class SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//input password
			System.out.println("Enter your password(type 'exit' to quit):");
			String password = scanner.nextLine();
			
			//===========================================================================
			//type exit to end
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			
			//for password error text
			String error = "";
			
			//===========================================================================
			//if less than 8
			if(password.length() < 8) {
				error += "- Password must be at least 8 character long.\n";
			}
			
			//===========================================================================
			//check password have upper, lower and digit or not
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for(int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				
				if(ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				}
				else if(ch >= 'a' && ch <= 'z') {
					hasLowerCase = true;
				}
				else if(ch >= '0' && ch <= '9') {
					hasDigit = true;
				}
			}//for loop end
			
			//===========================================================================
			//concatenate error based on missing criteria
			if(!hasUpperCase) {
				error += "- Password must contain at least one uppercase letter(A-Z).\n";
			}
			
			if(!hasLowerCase) {
				error += "- Password must contain at least one lower letter(a-z).\n";		
			}
			
			if(!hasDigit) {
				error += "- Password must contain at least one digit(0-9).\n";
			}
			
			//display message
			if(error.isEmpty()) {
				System.out.println("Your password is secure.");
			}
			else {
				System.out.println("Password validation errors.");
				System.out.println(error);
			}
			
		}//while loop end
		scanner.close();

	}

}
