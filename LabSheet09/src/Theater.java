public class Theater extends Movie{
	//Attribute
	private int theaterNo;
	//Constructor
	public Theater(String id, String name, Director director, int theaterNo) {
		super(id, name, director);
		this.theaterNo = theaterNo;
	}
	
	public Theater() {}
	
	//Method
	public String getTheaterName() {
		if(theaterNo >= 1 && theaterNo <= 11){
			return "Basic Thearter";
		}
		else if (theaterNo >= 12 && theaterNo <= 14) {
			return "Sweet Thearter";
		}
		else if (theaterNo == 15) {
			return "Premium Thearter";
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		return getTheaterName() + ": " + super.toString();
	}
}