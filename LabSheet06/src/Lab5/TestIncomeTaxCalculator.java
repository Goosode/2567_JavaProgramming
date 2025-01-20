//========================== Lab5 ===========================
public class TestIncomeTaxCalculator {
    public static void main(String[] args) {
        //Obj
        IncomeTaxCalculator taxCalculator = new IncomeTaxCalculator();

        //set
        taxCalculator.setIncome(450000);

        //displays
        taxCalculator.displayTaxDetails();
    }
}