import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Name
		System.out.print("Input Product Name 	: ");
		String productName = scan.nextLine();

		// Unit
		System.out.print("Input Product Unit 	: ");
		int productUnit = scan.nextInt();
				
		//price
		System.out.print("Input Price per unit 	: ");
		float productPrice = scan.nextFloat();
		
		System.out.print("------------------------------------------");
		//total price
		float totalprice = productPrice * productUnit;
		System.out.print("Total Price is " + totalprice + " baht.");
		
		System.out.print("------------------------------------------");
		
		
		
		scan.close();
	}

}
