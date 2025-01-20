//========================== Lab5 ==========================
public class IncomeTaxCalculator {
	//Attribute
	private float income;
	
	//Method
	//set
	public void setIncome(float setIncome) {
		income = setIncome;
	}
	
	//calculate
	public float calculateTax() {
		float tax = 0;

		if(income > 500000) {//more than 500000
			tax += (300000 - 150000) * 0.05;
			
			tax += (500000 - 300000) * 0.1;
			
			tax += (income) * 0.2;
		}
		else if (income > 300000 && income <= 500000) {//less than 500000, more than 300000
			tax += (300000 - 150000) * 0.05;
			
			tax += (income - 300000) * 0.1;
		}
		else if(income > 150000 && income <= 300000){//less than 300000, more than 150000
			tax += (income - 150000) * 0.05;
		}
		else{//less than 150000
			tax = 0;
		}
		
		return tax;
	}
	
	public void displayTaxDetails() {
		System.out.println("Income: " + income);
		System.out.println("Tax: " + CalculateTax());
	}
}