import java.util.*;

public class Lab204 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input X Y
		System.out.print("Input value of X : ");
		int num1 = scanner.nextInt();
		
		System.out.print("Input value of Y : ");
		int num2 = scanner.nextInt();

		while(true) {
			if(num2 < num1) {
				System.out.print("Input value of Y, again : ");
				num2 = scanner.nextInt();
			}
			
			for(int i = 1; i <= num2; i++) {
				
			}
		}
	}

}
