package Lab3;
//==========================================Lab3==========================================
public class Coffee extends Drink{
	//Attribute
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	//Constructor
	public Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		super(type, '\u0000');
		this.sizeCoffee = sizeCoffee;
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
		if(this.typeCoffee == 1) {
			return "Americano";
		}
		else if(this.typeCoffee == 2){
			return "Espresso";
		}
		else if(this.typeCoffee == 3){
			return "Cappuccino";
		}
		
		return null;
	}//getTypeName end
	
	public int getTypePirce() {
		if(this.typeCoffee == 1) {
			return 50;
		}
		else if(this.typeCoffee == 2){
			return 55;
		}
		else if(this.typeCoffee == 3){
			return 65;
		}
		
		return 0;
	}//getTypePirce end
	
	public String getSizeName() {
		if(Character.toLowerCase(this.sizeCoffee) == 's') {
			return "Short";
		}
		else if(Character.toLowerCase(this.sizeCoffee) == 't') {
			return "Tall";
		}
		else if(Character.toLowerCase(this.sizeCoffee) == 'g') {
			return "Grande";
		}
		else if(Character.toLowerCase(this.sizeCoffee) == 'v') {
			return "Venti";
		}
		
		return null;
	}//getSizeName end
	
	public int getSizePrice() {
		if(Character.toLowerCase(this.sizeCoffee) == 's') {
			return 100;
		}
		else if(Character.toLowerCase(this.sizeCoffee) == 't') {
			return 150;
		}
		else if(Character.toLowerCase(this.sizeCoffee) == 'g') {
			return 200;
		}
		else if(Character.toLowerCase(this.sizeCoffee) == 'v') {
			return 250;
		}	
		
		return 0;
	}//getSizePrice end
	
	public int getTotalPrice() {
		return super.getTypePirce() + this.getTypePirce() + this.getSizePrice();
	}//getTotalPrice end

	public String toString() {
		return super.getTypeName() + " " + this.getTypeName() + " (" + this.getSizeName() + ") is " + this.getTotalPrice() + " baht.";
	}
}
