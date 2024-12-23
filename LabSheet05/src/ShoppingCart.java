
public class ShoppingCart {

	public static void main(String[] args) {
		//test shopping cart system
		DisplayItemAndTotal("Apple", 10.5f, "Banana", 5.75f, "Orange", 7.3f);
		DisplayItemAndTotal("Milk", 20f, "Bread", 15f);
		DisplayItemAndTotal();
	}

	public static void DisplayItemAndTotal(Object... items) {
		if(items.length == 0) {
			System.out.println("No item in the cart.");
			return;
		}
		
		float totalPrice = 0;
		System.out.println("Item in the cart: ");
		
		for(int i = 0; i < items.length; i += 2) {
				String itemName = (String)items[i]; //odd index is a name
				float itemPrice = (float)items[i + 1]; //even index is a price
				
				System.out.printf("- %s: $%.2f%n", itemName, itemPrice);
		}
		
		System.out.printf("Total Price: $%.2f%n", totalPrice);
		System.out.println();
	}
	
	

}
