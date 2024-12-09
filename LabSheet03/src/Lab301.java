import java.util.*;

public class Lab301 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String text = "";
		String word;

		while(true) {
			System.out.print("Enter word: ");
			word = scanner.next();
			
			//if word is stop end loop
			if(word.equalsIgnoreCase("stop")) {//ignore upper or lower alphabet
				System.out.println("Your terminate program...");
				break;
			}
			
			text = text + word + " ";
			
		}
		System.out.println(text.toUpperCase());
		
		scanner.close();
	}

}
