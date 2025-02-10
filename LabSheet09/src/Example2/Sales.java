

public class Sales extends Employee{
	//Attribute
	private double sales;
	
	//Constructor
	public Sales(String id, String name, double salary, double sales) {
		super(id, name, salary);
		this.sales = sales;
	}
	
	public Sales(String id, String name, double sales) {
		super(id, name);
		this.sales = sales;
	}
	
	//Method
	public double getCommission() {
		if(sales < 10000) {
			return 0;
		}
		else if (sales < 50000) {
			return (this.sales - 10000) * 10/100;
		}
		else {
			return (this.sales - 50000) * 15/100;
		}
	}
	
	public String toString() {
		return (super.getName() + " (" + super.getId() + ") " + "get commission " + getCommission() + "B.");
	}
}
