public class Movie {
	//Attribute
	private String id;
	private String name;
	private Director director;
	
	//Constructor
	public Movie(String id, String name, Director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	
	public Movie() {}
	
	//Method
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Director getDirector() {
		return this.director;
	}
	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public String toString() {
		return getId() + " " + getName() + " direct by " + director;
	}
}