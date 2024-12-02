import javax.swing.*;

public class Lab104 {
    public static void main(String[] args){
        //start
        JOptionPane.showMessageDialog(null, "Welcome to the payroll application");

        //------------------------------- Declare and initialize variables -------------------------------
        //input name
        String employeeName = JOptionPane.showInputDialog("Enter employee name");

        //input hour
        int hour = Integer.parseInt(JOptionPane.showInputDialog("Enter total hours for this employee."));
    
        //input wage
        float wage = Float.parseFloat(JOptionPane.showInputDialog("Enter wage hour for this employee."));
    

        //------------------------------- Calculate earnings -------------------------------
        //calculate eaening
        float earnings = hour * wage;

        //calculate tax
        final float TAX = 0.15f;
        float totalTax = earnings * TAX;

        //calculate net
        float netEarning = earnings - totalTax;

        //------------------------------- Display output -------------------------------
        JOptionPane.showMessageDialog(null, "Employee name: " + employeeName
                                    + "\nHours worked: " + hour 
                                    + "\nHourly wage: $ " + wage
                                    + "\nGross earnings: $ " + earnings
                                    + "\nTax rate: " + TAX
                                    + "\nTax: $ " + totalTax
                                    + "\nNet earnings: $ " + netEarning);
    }
}