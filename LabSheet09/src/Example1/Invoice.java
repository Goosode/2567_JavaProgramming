package Example1;

public class Invoice{
	//Attribute
	private int invid;
	private Customer customer;
	private double amount;
	
	//Constructor
	public Invoice(int invid, Customer customer, double amount) {
		this.invid = invid;
		this.customer =customer;
		this.amount = amount;
	}
	
	//Method
	public int getInvID() {
		return this.invid;
	}
	
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public int getCustomerID() {
		return getCustomer().getCusID();
	}
	
	public String getCustomerName() {
		return getCustomer().getName();
	} 
	
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return getAmount() - (getAmount() * getCustomerDiscount()/100);
	}
	
	public String toString() {
		return "Invoice[id=" + getInvID() + ",customer=" + customer + ",amount=" + getAmountAfterDiscount() + "]";
	}
}
