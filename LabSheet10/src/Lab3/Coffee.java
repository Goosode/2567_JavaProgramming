
//==========================================Lab3==========================================
public class Coffee extends Drink{
	//FIX
	
	//Attribute
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	//Constructor
	public Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		super(type, sizeCoffee);
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	
	public Coffee(int type, int typeCoffee) {
		super(type, ' ');
		this.typeCoffee = typeCoffee;
	}
	
	//Method
	public Barista getBarista() {
		return this.barista;
	}//getBarista end
	
	public String getTypeName() {
		if(typeCoffee == 1) {
			return "Americano";
		}
		else if(typeCoffee == 2){
			return "Espresso";
		}
		else if(typeCoffee == 3){
			return "Cappuccino";
		}
		
		return null;
	}//getTypeName end
	
	public int getTypePirce() {
		if(typeCoffee == 1) {
			return 50;
		}
		else if(typeCoffee == 2){
			return 55;
		}
		else if(typeCoffee == 3){
			return 65;
		}
		
		return 0;
	}//getTypePirce end
	
	public String getSizeName() {
		if(Character.toLowerCase(sizeCoffee) == 's') {
			return "Short";
		}
		else if(Character.toLowerCase(sizeCoffee) == 't') {
			return "Tall";
		}
		else if(Character.toLowerCase(sizeCoffee) == 'g') {
			return "Grande";
		}
		else if(Character.toLowerCase(sizeCoffee) == 'v') {
			return "Venti";
		}
		
		return null;
	}//getSizeName end
	
	public int getSizePrice() {
		if(Character.toLowerCase(sizeCoffee) == 's') {
			return 100;
		}
		else if(Character.toLowerCase(sizeCoffee) == 't') {
			return 150;
		}
		else if(Character.toLowerCase(sizeCoffee) == 'g') {
			return 200;
		}
		else if(Character.toLowerCase(sizeCoffee) == 'v') {
			return 250;
		}	
		
		return 0;
	}//getSizePrice end
	
	public int getTotalPrice() {
		return getTypePirce() + getSizePrice();
	}//getTotalPrice end
}
