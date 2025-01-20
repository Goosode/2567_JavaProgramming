//========================== Lab3 ==========================
import java.util.*;

public class TestProductInput {

	public static void main(String[] args) {
		//obj
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		//set
		System.out.print("Enter product name: ");
		String name = scanner.nextLine();//name product
		
		System.out.print("Enter product price: ");
		float price = scanner.nextFloat();//price product
		
		System.out.print("Enter VAT rate (%): ");
		float vat = scanner.nextFloat();//vat rate
		
		product.setProductDetails(name, price, vat);
		
		//display
		System.out.println("\nProduct Details:");
		product.displayProductDetails();
		
		scanner.close();
	}
}
