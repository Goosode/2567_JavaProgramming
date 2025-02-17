

public class ResizableCircle extends Circle implements Resizable{
	//Constructor
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]";
	}

	@Override
	public void resize(int percent) {
		radius *= percent/100.0;
	}

}
