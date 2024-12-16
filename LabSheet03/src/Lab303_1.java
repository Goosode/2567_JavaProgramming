import javax.swing.*;

public class Lab303_1 {

	public static void main(String[] args) {
		//Input.
		String input = JOptionPane.showInputDialog("Input a sentence:");
		
		int emptySpace = 0;
		int word = 0;
		
		while(!input.endsWith(".")) {
			//check word end with "."?
			input = JOptionPane.showInputDialog("Input a sentence, again:");
		}	
		
		//check input have empty space
		for(int i = 0; i < input.length(); i++) {
			char countSpace = input.charAt(i);
			
			if(countSpace == ' ') {
				emptySpace++;
			}
		}
		
		//count word
		String[] split = input.split(" ");
		for(int i = 0; i < split.length; i++) {
			word++;
		}
		
		JOptionPane.showMessageDialog(null, "This sentence has " + emptySpace + " spacebar."
									+ "\nThis sentence has " + word + " word.");
	}

}
