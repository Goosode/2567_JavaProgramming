//========================== Lab6 ==========================
import java.util.*;

public class TestUtilityBillCalculatorInput {
    public static void main(String[] args) {
        //obj
        Scanner scanner = new Scanner(System.in);
        UtilityBillCalculator billCalculator = new UtilityBillCalculator();

        //Input and set 
        System.out.print("Enter electricity usage (units): ");
        float electricity = scanner.nextFloat();
        System.out.print("Enter water usage (units): ");
        float water = scanner.nextFloat();

        billCalculator.setUsage(electricity, water);

        //display
        System.out.println("\nBill Details:");
        billCalculator.displayBillDetails();
        System.out.println("Total Bill: " + (billCalculator.calculateElectricityBill() + billCalculator.calculateWaterBill()) + " THB");
    
        scanner.close();
    }
}
