import java.util.Scanner;

public class Lab202_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {	
			//Input 
			System.out.print("Input number: ");
			int number = scanner.nextInt();
			
			//Min value 
			int tempNum = Integer.MIN_VALUE;
			
			//if tempNum more than number program will stop
			if(tempNum > number) {
				System.out.print("BYE BYE");
				break;
			}
			
			tempNum = number;
		}

	}

}
