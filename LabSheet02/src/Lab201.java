import java.text.*;
import javax.swing.*;

public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember;
		
		//number format
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		
		//user Input
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));

		//calculate bill
		float totalPrice = numberOfCustomer * BUFFET;
		
		do{
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is " + frm.format(numberOfCustomer) + " baht."
														+ "\nDo you have a member card?");
		}while(isMember == 2);

		
		float discount = totalPrice - (totalPrice * 0.1f);
		
		if(isMember == 0) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(numberOfCustomer) + " baht.");
		}
		else if (isMember == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(numberOfCustomer) + " baht.");
		}
	}
}
