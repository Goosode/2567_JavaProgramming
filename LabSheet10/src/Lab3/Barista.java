package Lab3;
//==========================================Lab3==========================================
public class Barista {
	//Attribute
	private String name;
	private char gender;
	
	//Constructor
	public Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Barista() {}
	
	//Method
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		if(Character.toLowerCase(gender) == 'm') {
			return "Male";
		}
		
		else if(Character.toLowerCase(gender) == 'f') {
			return "Female";
		}
		
		return " ";
	}
}