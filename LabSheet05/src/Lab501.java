import javax.swing.*;

public class Lab501 {

	public static void main(String[] args) {
		int[] idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		float[] priceProduct = { 0.89f, 1.23f, 3.50f, 0.69f, 5.79f, 3.19f, 0.99f, 0.89f, 1.26f, 8.00f};
		
		float itemPrice = 0; // get price from input
		boolean validItem = false; //Check compare
		
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item number to order"));
		
		for(int i = 0; i < idProduct.length; i++) {
			if(itemOrder == idProduct[i]) {
				itemPrice = priceProduct[i];
				validItem = true;
			}
		}
		
		if(validItem) {
			JOptionPane.showMessageDialog(null, "Item " + itemOrder + " is " + itemPrice);
			System.out.print("Item " + itemOrder + " is " + itemPrice);
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid Item");
			System.out.print("Invalid Item");
		}
	}

}
