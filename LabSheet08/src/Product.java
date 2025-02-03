//================================= Lab2 ================================= 
public class Product {
	//Attribute
	private String productID;
	private int productUnit;
	private double productPrice;
	
	//Method
	public void setId(String pid) {
		productID = pid;
	}
	
	public String getId() {
		return productID;
	}
	
	public void setUnit(int proUnit) {
		productUnit = proUnit;
	}
	
	public int getUnit() {
		return productUnit;
	}
	
	public void setPrice(double proPrice) {
		productPrice = proPrice;
	}
	
	public double getPrice() {
		return productPrice;
	}
	
	public double calculate() {
		return productUnit * productPrice;
	}
}
