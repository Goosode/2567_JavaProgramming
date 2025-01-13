//========================== Lab3 ==========================
public class TestProduct {

	public static void main(String[] args) {
		//obj
		Product product = new Product();
		
		//set
		product.SetProductDetails("Smartphone", 30000.0f, 7.0f);
		
		//display
		System.out.println("Product Details:");
		product.DisplayProductDetails();

	}

}
