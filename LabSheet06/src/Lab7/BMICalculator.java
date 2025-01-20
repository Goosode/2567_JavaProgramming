//========================== Lab7 ===========================
public class BMICalculator {
    //attribute
    private float weight;
    private float height;

    //method
    //set
    public void setDetails(float setWeight, float setHeight){
        weight = setWeight;
        height = setHeight;
    }

    //calculate
    public float calculateBMI(){
        return weight / (height * height);
    }

    //category
    public String getBMICategory(){
        float bmi = calculateBMI();

        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25){
            return "Normal weight";
        }
        else if(bmi >= 25 && bmi < 30){
            return "Overweight";
        }

        return "Obese";
    }

    //display
    public void displayBMIDetails(){
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("BMI: " + calculateBMI());
        System.out.println("Category: " + getBMICategory());
    }
}
