//========================== Lab6 ==========================
public class TestUtilityBillCalculator {
    public static void main(String[] args) {
        //Obj
        UtilityBillCalculator billCalculator = new UtilityBillCalculator();

        //set
        billCalculator.setUsage(200, 40);

        //display
        billCalculator.displayBillDetails();
    }
}