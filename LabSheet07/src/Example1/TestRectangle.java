//=================================== Example1 ===================================
public class TestRectangle {
	public static void main(String[] args) {
		// Test constructors and toString()
		 Rectangle r1 = new Rectangle();
		 System.out.println(r1); //r1.toString()
		 
		 Rectangle r2 = new Rectangle(1.2f, 3.4f);
		 System.out.println(r2);
		 System.out.println();
		 
		 //set and get
		 r1.setLength(5.6f);
		 r1.setWidth(7.8f);
		 System.out.println(r1);
		 System.out.println("Length is " + r1.getLength());
		 System.out.println("Width is " + r1.getWidth());
		 System.out.printf("Area is %.2f%n", r1.getArea());
		 System.out.printf("Perimaeter is %.2f", r1.getPerimaeter());
	}

}
