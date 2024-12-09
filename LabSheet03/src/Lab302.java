import javax.swing.*;

public class Lab302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		
		//if start with @ or have empty space. loop
		while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
			
		}
		
		while(true) {
			//if input is a gmail or hotmail end program
			if(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
				JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
				break;
			}
			//if input is not a gmail or hotmail input against 
			else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
				inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
			}
		}
	}

}
