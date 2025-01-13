//========================== Lab3 ==========================
import java.util.*;

public class TestProductInput {

	public static void main(String[] args) {
		//obj
		Scanner scanner = new Scanner(System.in);
		Product pro = new Product();

		//set
		System.out.print("Enter product name: ");
		String name = scanner.nextLine();//name product
		
		System.out.print("Enter product price: ");
		float price = scanner.nextFloat();//price product
		
		System.out.print("Enter VAT rate (%): ");
		float vat = scanner.nextFloat();//vat rate
		
		pro.SetProductDetails(name, price, vat);
		
		//display
		System.out.println("\nProduct Details:");
		pro.DisplayProductDetails();
		
		scanner.close();
	}
}
