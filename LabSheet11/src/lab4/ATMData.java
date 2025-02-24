//=========================================Lab4=========================================
public class ATMData {
	//Attribute
	private String accountNumber;
	private String password;
	
	//Constructor
	public ATMData(String accountNumber, String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	//Method
	public String getID() {
		return this.accountNumber;
	}
	
	public String getPass() {
		return this.password;
	}
}
