package Example2;
//================================= Example2 ================================= 
public class Book {
	//Attribute
	private String title;
	private Author author;
	private int page;
	
	//Constructor
	public Book(String title, Author author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
		this.page = 0;
	}
	
	public Book() { //Default
		this.title = null;
		this.author = null;
		this.page = 0;
	}
	
	//Method
	public String getTitle() {
		return this.title;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return this.page;
	}
	
	public String toString() {
		return getTitle() + " has " + getPage() + " pages write by " + author;
	}
}
