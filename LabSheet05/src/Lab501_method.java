import javax.swing.JOptionPane;

public class Lab501_method {
	//Global array
	static int[] idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static float[] priceProduct = { 0.89f, 1.23f, 3.50f, 0.69f, 5.79f, 3.19f, 0.99f, 0.89f, 1.26f, 8.00f};
	
	static float itemPrice = 0; // get price from input
	static boolean validItem = false; //Check compare
	
	public static void main(String[] args) {	
		InputItem();
		
	}//Main end

	public static void InputItem() {
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item number to order"));
		
		if(CheckItem(itemOrder)) {
			System.out.print("Item " + itemOrder + " is " + itemPrice);
		}
		else {
			System.out.print("Invalid Item");
		}
		
	}//InputItem end

	public static boolean CheckItem(int item) {
		for(int i = 0; i < idProduct.length; i++) {
			if(item == idProduct[i]) {
				itemPrice = priceProduct[i];
				validItem = true;
			}
			
		}
		
		return validItem;
	}//CheckItem end
}
