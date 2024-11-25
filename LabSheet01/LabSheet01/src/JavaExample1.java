import java.util.*;
import java.text.*;

public class JavaExample1 {
	public static void main(String[] args) {
		//input data from keyboard
		Scanner scan = new Scanner(System.in);
		//define object for manage format nunber by decimal format
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		// input product name
		System.out.print("Input product name	: ");
		String productName = scan.nextLine();

		// input product unit
		System.out.print("Input product unit	: ");
		int productUnit = scan.nextInt();

		// input product price
		System.out.print("Input price per unit	: ");
		float productPrice = scan.nextFloat();

		System.out.println();
		System.out.println("Product name is : " + productName);
		
		// calculate price
		float totalPrice = productUnit * productPrice;
		System.out.println("Total Price is " + frm.format(totalPrice) + " baht.");

		// vat 7%
		float totalVat = totalPrice + (totalPrice * 7 / 100);
		System.out.println("Add VAT 7% is " + frm.format(totalVat) + " baht.");
		
		
		System.out.println();
		//output using string.format and printf
		System.out.println("============= Using printf and string.format =============");
		System.out.printf("Product name is : %s", productName);
		System.out.printf("\nTotal price is %,.2f", totalPrice);
		System.out.printf("\nAdd VAT 7%% is %s baht.", String.format("%.2f", totalPrice));
		
		
		
		
		//Close scanner
		scan.close();
	}
}
