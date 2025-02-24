public class Director {
	//Attribute
	private String name;
	private String email;
	private char gender;
	
	//Constructor
	public Director(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public Director(String name, String email) {
		this(name, email, '\u0000');
	}
	
	//Method
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getGenderName() {
		if(Character.toLowerCase(this.gender) == 'm') {
			return "Male";
		}
		else if(Character.toLowerCase(this.gender) == 'f'){
			return "Female";
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		return getName() + " (" + getEmail() + ";" + getGenderName() + ")";
	}
}