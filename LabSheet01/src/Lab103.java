import java.util.*;

import javax.swing.JOptionPane;;

public class Lab103 {
    public static void main(String[] args){
        //input minute
        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking (minute):"));       

        //calculate time
        int hour = minute / 60;
        int remainMinute = minute % 60;

        //calculate amount
        float hourPrice = hour * 50;
        float minutePrice = remainMinute * .25f;
        float totalPrice = hourPrice + minutePrice;

        JOptionPane.showMessageDialog(null, "You parking " + hour + " Hour " + remainMinute + " Minute." 
                                    + "\nAmount to be paid is " + totalPrice + " baht.");   
    }
}