import java.util.*;
import java.text.*;

public class Lab101 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//decimal format
		DecimalFormat frm = new DecimalFormat("#,###.00");
		DecimalFormat forDiscount= new DecimalFormat("#");

		// Name
		System.out.print("Input Product Name 	: ");
		String productName = scan.nextLine();

		// Unit
		System.out.print("Input Product Unit 	: ");
		int productUnit = scan.nextInt();
				
		//price
		System.out.print("Input Price per unit 	: ");
		float productPrice = scan.nextFloat();
		
		System.out.println("------------------------------------------");
		//total price
		float totalprice = productPrice * productUnit;
		System.out.println("Total Price is " + frm.format(totalprice) + " baht.");
		
		System.out.println("------------------------------------------");
		
		//discount
		System.out.print("How many discount (%) : ");
		float discount = scan.nextFloat();
		
		System.out.println("------------------------------------------");
		//discount calculate
		float totalDiscount = totalprice * (discount / 100);
		float totalPaid = totalprice - totalDiscount;
		
		
		System.out.print("Discount from " + forDiscount.format(discount) + "%\t\t" + frm.format(totalDiscount) + " baht."
						+ "\nAmount to be paid \t\t" + frm.format(totalPaid) + " baht.");
		
		scan.close();
	}

}
