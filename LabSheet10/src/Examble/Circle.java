package Examble;
//================================Example1==========================================

public class Circle implements GeometricObject{
	//Variable
	protected double radius;
	
	//Constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

}
