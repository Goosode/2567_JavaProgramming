//========================== Lab4 ===========================
public class LoanCalculator {
	//Attribute 
	private String productName;
	private float price;
	private float interestRate;
	private int year;
	
	//method
	//set
	public void setLoanDetails(String prodName, float prodPrice, float rate, int y) {
		productName = prodName;
		price = prodPrice;
		interestRate = rate;
		year = y;
	}
	
	//calculate
	public float calculateMonthlyPayment() {
		int month = year * 12;
		float rate = interestRate / 100;
		rate = rate / 12;
				
		//calculate
		float firstStep = 1 + rate;
		float finalStep = (float)Math.pow(firstStep, month);
		
		return (price * rate * finalStep) / (finalStep - 1);
	}
	
	//display
	public void displayLoanDetails() {
		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Interest Rate: " + interestRate + "%");
		System.out.println("Loan Period: " + year + " years");
		System.out.println("Monthly Payment: " + CalculateMonthlyPayment());
	}
}
