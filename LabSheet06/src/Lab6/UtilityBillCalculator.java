//========================== Lab6 ===========================
public class UtilityBillCalculator {
    //Attribute
    private float electricityUsage;
    private float waterUsage;

    //Method
    //set
    public void setUsage(float electricity, float water){
        electricityUsage = electricity;
        waterUsage = water;
    }

    //calculate electric
    public float calculateElectricityBill(){
        float bathPerUnit = 0;

        if(electricityUsage <= 50){
            bathPerUnit = electricityUsage * 1.5f;
        }
        else if(electricityUsage > 50 && electricityUsage <= 150){
            bathPerUnit = electricityUsage * 2.5f;
        }
        else{
            bathPerUnit = electricityUsage * 3;
        }

        return bathPerUnit;
    }

    //calculate water
    public float calculateWaterBill(){
        float bathPerUnit = 0;
        
        if(waterUsage <= 30){
            bathPerUnit = waterUsage * 10;
        }
        else{
            bathPerUnit = waterUsage * 15;
        }

        return bathPerUnit;
    }

    //display
    public void displayBillDetails(){
        System.out.println("Electricity Usage: " + electricityUsage + " units");
        System.out.println("Electricity Bill: " + CalculateElectricityBill() + " THB");
        System.out.println("Water Usage: " + waterUsage + " units");
        System.out.println("Water Bill: " + CalculateWaterBill() + " THB");
    }
}