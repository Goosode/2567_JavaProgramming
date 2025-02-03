//================================= Lab3 ================================= 
import java.util.*;
public class CheckStockProduct {
	public static void main(String[] args) {
		//OBJ
		Scanner scanner = new Scanner(System.in);
		
		//input list
		System.out.print("How many product list in stock : ");
		int list = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println();
		
		//arr obj
		Product[] productList = new Product[list];
		
		//forloop
		for(int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			
			//Id
			System.out.print("Input product Id    : ");
			productList[i].setId(scanner.nextLine());
			
			//Unit
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scanner.nextInt());
			scanner.nextLine();
			
			System.out.println();
		}//forloop end
		
		Text("LOW");
		
		//foreach
		for (Product _productList : productList) {
			
			if(_productList.getUnit() < 5) {
				System.out.println(">> " + _productList.getId() + " has " + _productList.getUnit() + " units");
			}//if end	
		}//foreach end
		
		Text("NORMAL");
		
		//foreach
		for (Product _productList : productList) {
			if(_productList.getUnit() >= 5 && _productList.getUnit() <= 50) {
				System.out.println(">> " + _productList.getId() + " has " + _productList.getUnit() + " units");
			}//if end
		}//foreach end
		
		Text("HIGH");
		
		//foreach
		for (Product _productList : productList) {	
			if(_productList.getUnit() > 50) {
				System.out.println(">> " + _productList.getId() + " has " + _productList.getUnit() + " units");
			}//if end
		}//foreach end
		
		
		scanner.close();
	}
	
	public static void Text(String text) {
		for(int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("List of product in \'" + text +"\' status.");
		
		for(int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
