import java.text.*;

import javax.swing.*;

public class Lab203 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#.0");
		
		//Input weight
		float weight = Float.parseFloat(JOptionPane.showInputDialog(null, "Input Weight"));
		
		//Input height
		float height = Float.parseFloat(JOptionPane.showInputDialog(null, "Input Height"));

		//Centimeter to meter
		height = height / 100;
		float bmi = weight / (height * height); //BMI calculate
		
		String bmiText = "";
		
		if(bmi < 18.5) {
			bmiText = "Underweight";
		}
		else if(bmi >= 18.5 && bmi <= 24.9) {
			bmiText = "Normal-weight";
		}
		else if(bmi >= 25 && bmi <= 29.9) {
			bmiText = "Overweight";
		}
		else if(bmi > 30) {
			bmiText = "Obesity";
		}
		
		JOptionPane.showMessageDialog(null, "BMI = " + frm.format(bmi)
									+ "\nYou're " + bmiText);
	}

}
