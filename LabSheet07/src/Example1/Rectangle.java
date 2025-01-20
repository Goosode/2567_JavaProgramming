//=================================== Example1 ===================================
public class Rectangle {
	//Attribute
	private float length = 1;
	private float width = 1;
	
	//Constructor
	Rectangle() {} //Default
	
	Rectangle(float length, float width) { //Parameterized
		this.length = length;
		this.width = width;
	}//Constructor End
	
	
	//Method length
	public float getLength() {
		return this.length;
	}//getLength End
	
	public void setLength(float length) {
		this.length = length;
	}//setLength End
	
	
	//Method width
	public float getWidth() {
		return this.width;
	}//getWidth End
	
	public void setWidth(float width) {
		this.width = width;
	}//setWidth End
	
	
	//Method calculate
	public double getArea() {
		return this.length * this.width;
	}//getArea End
	
	public double getPerimaeter() {
		return 2 * (this.length + this.width);
	}//getPerimaeter End
	
	
	//Method toString()
	public String toString() {
		return "Rectangle[length = " + this.length + ",width" + this.width + "]";
	}//toString End
}
