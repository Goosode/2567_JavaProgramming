

public class Customer {
	//Attribute
	private int cid;
	private String name;
	private int discount;
	
	//Constructor
	public Customer(int cid, String name, int discount) {
		this.cid = cid;
		this.name = name;
		this.discount = discount;
	}
	
	//Method
	public int getCusID() {
		return this.cid;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString() {
		return getName() + "(" + getCusID() + ")(" + getDiscount() + "%)";
	}
}
