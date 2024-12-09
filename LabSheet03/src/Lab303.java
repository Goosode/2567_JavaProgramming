import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String input = scanner.nextLine();
		
		int emptySpace = 0;
		int word = 0;
		
		while(!input.endsWith(".")) {
			//check word end with "."?
			System.out.print("Input a sentence, again: ");
			input = scanner.nextLine();
			
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
		
		System.out.println();
		System.out.println("This sentence has " + emptySpace + " spacebar.");
		System.out.println("This sentence has " + word + " word.");
		
		scanner.close();
	}

}
