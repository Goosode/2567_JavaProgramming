import javax.swing.*;

public class Lab401 {
	//Global variable
	static String varEmail;

	public static void main(String[] args) {
		InputEmail();
	}// main method

	public static void InputEmail() {
		String ans = "";
		
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			//if email is not null, use method to check first alphabet is @ or empty space?
			if(varEmail != null && !varEmail.isEmpty()) {
				CheckEmailError(varEmail);
			}
			//if email is null show error.
			else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!");
			}
			
			ans = JOptionPane.showInputDialog("Continue? (y||Y to continue)");		
		}while(ans != null && ans.equalsIgnoreCase("y"));
	}// InputEmail method end

	public static void CheckEmailError(String email) {
		//if start with @ and empty space
		while(email.startsWith("@") || email.contains(" ")) {
			varEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				CheckEmail(email) ? "Your e-mail is " + email : "Your e-mail is not hotmail or gmail address.");
	}// CheckEmailError method end

	public static boolean CheckEmail(String email) {		
		return email.endsWith("@gmail.com") || email.endsWith("@hotmail");
	}// CheckEmail method end

}
