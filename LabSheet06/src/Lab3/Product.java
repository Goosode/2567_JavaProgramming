//========================== Lab3 ==========================
public class Product {
	//Attribute 
	private String name;
	private float price;
	private float vatRate;
	
	//method
	//set detail
	public void setProductDetails(String productName, float productPrice, float productVat) {
		name = productName;
		price = productPrice;
		vatRate = productVat;
	}
	
	//calculate
	public float calculateTotalPrice() {
		return price = price + (price * vatRate/100);
	}
	
	//display
	public void displayProductDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Price (Before VAT): " + price);
		System.out.println("Price (After VAT): " + CalculateTotalPrice());
	}
}
