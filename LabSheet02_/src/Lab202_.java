import java.util.*;

public class Lab202_ {

	public static void main(String[] args) {
		//use to input
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		
		//Min value 
		int tempNum = Integer.MIN_VALUE;
		
		while(true) {	
			//if tempNum more than number program will stop
			if(tempNum > number) {
				System.out.println();
				System.out.println("BYE BYE");
				break;
			}
			tempNum = number;
			
			System.out.print("Input number: ");
			number = scanner.nextInt();
		}
		
		scanner.close();

	}

}
