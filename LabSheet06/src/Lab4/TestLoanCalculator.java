
//========================== Lab4 ===========================
public class TestLoanCalculator {

	public static void main(String[] args) {
		//obj
		LoanCalculator loan = new LoanCalculator();
		
		//set
		loan.setLoanDetails("Labtop", 50000, 5, 2);
		
		//display
		loan.displayLoanDetails();
	}

}
