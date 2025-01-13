//========================== Lab3 ==========================
public class TestProduct {

	public static void main(String[] args) {
		//obj
		Product pro = new Product();
		
		//set
		pro.SetProductDetails("Smartphone", 30000.0f, 7.0f);
		
		//display
		System.out.println("Product Details:");
		pro.DisplayProductDetails();

	}

}
