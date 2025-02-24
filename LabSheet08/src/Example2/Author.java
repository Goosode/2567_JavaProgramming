package Example2;
//================================= Example2 ================================= 
public class Author {
	//Attribute
	private String name;
	private String email;
	
	//Constructor
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Author() { //Default
		this.name = null;
		this.email = null;
	}
	
	//Method
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return getName() + " (" + getEmail() + ")";
	}
}
