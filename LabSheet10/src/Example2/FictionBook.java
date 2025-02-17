
//===============================================Example2============================================

public class FictionBook implements Author, Book{
	//Attribute
	private String author_name; 
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	//Constructor
	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	//Method
	public void setAuthorName(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		fname = author_name.substring(0, space);
		lname = author_name.substring(space + 1);;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return getTitle() + " write by " + getLastName().charAt(0) + "." + getFirstName() + " (" + getEmail() + ")\n"
				+ "Published for " + totalPublicYear() + " year(s).";
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public int totalPublicYear() {
		return 2025 - this.publicYear;
	}

	@Override
	public String getLastName() {
		return lname.toUpperCase();
	}

	@Override
	public String getFirstName() {
		return fname.toUpperCase();
	}

	@Override
	public boolean checkEmail() {
		return getEmail().endsWith("@hotmail.com") || getEmail().endsWith("@windowslive.com") ? true : false;
	}
}
