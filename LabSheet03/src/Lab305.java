import java.util.*;

public class Lab305 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //user input
        System.out.print("Input some sentence : ");
        String sentence = scanner.nextLine();

        //check have . in last sentence
        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point : ");
            sentence = scanner.nextLine();
        }

        System.out.println();
        //Replace all empty space with \n
        System.out.println(sentence.replace(' ', '\n'));

        scanner.close();
	}

}
