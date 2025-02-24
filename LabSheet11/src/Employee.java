//==================================Example5==================================
public class Employee {
	//Attribute
	private String dept;
	
	//Method
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void header() {
		for (int i = 1; i <= 50; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
