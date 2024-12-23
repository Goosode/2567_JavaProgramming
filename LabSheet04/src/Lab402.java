import javax.swing.*;

public class Lab402 {
    public static void main(String[] args){
        //variable
        int year;

        //get year value, if is less than 1000 and more than 3000 loop.
        do {
            year = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
        } while (!CheckYear(year));

        //check is leap year?
        if(IsLeapYear(year)){
            JOptionPane.showMessageDialog(null, year + " is Leap year.");
        }
        else{
            JOptionPane.showMessageDialog(null, year + " is NOT Leap year.");
        }
    }//Main end

    public static boolean IsLeapYear(int year) {
        //if year division 4 is 0 and 100 division is'n 0
        if(year % 4 == 0 && year %  100 != 0){
            return true;
        }
        //if year division 100 is 0 and 400 division is 0
        else if(year %  100 == 0 && year %  400 == 0){
            return true;
        }

        return false;
    }//IsLeapYear end

    public static boolean CheckYear(int year){
        //check year is less than 1000 or more than 3000    
        return (year >= 1000 && year <= 3000);
    }//CheckYear ends
}