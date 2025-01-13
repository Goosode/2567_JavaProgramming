//========================== Lab5 ==========================
//Not finish
public class IncomeTaxCalculator {
	//Attribute
	private float income;
	
	//Method
	//set
	public void SetIncome(float setIncome) {
		income = setIncome;
	}
	
	//calculate
	public float CalculateTax() {
		float tax;
		if(income > 500000) {
			tax += (300000 - 150000) * 0.05;
			
			tax += (500000 - 300000) * 0.1;
			
			tax += (500000) * 0.2;
		}
		else if (income > 300000 || income <= 500000) {
			tax += (300000 - 150000) * 0.05;
			
			tax += (500000 - 300000) * 0.1;
		}
		else if(income > 150000 || income <= 300000){
			tax += (300000 - 150000) * 0.05;
		}
		else {
			tax = 0;
		}
	}
	
	public void DisplayTaxDetails() {
		System.out.println("Income: " + income);
		System.out.println("Tax: " + CalculateTax());
	}
}
