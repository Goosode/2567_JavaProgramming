
public class TestStudents {

	public static void main(String[] args) {
		//Obj
		Student student1 = new Student();
		Student student2 = new Student();
		
		//set detail
		student1.SetStudentDetails("Intouch", new float[] {85.0f, 67.0f, 78.5f});
		student2.SetStudentDetails("Sukonlawat", new float[] {90.0f, 59.8f});
		
		//display detail
		Line('=');
		System.out.println("Student#1 Details: ");
		student1.DisplayStudentDetails();
		Line('-');
		
		System.out.println("Student#2 Details: ");
		student2.DisplayStudentDetails();
		Line('=');
	}//main end
	
	public static void Line(char line) {
		for(int i = 1; i <= 40; i++) {
			System.out.print(line);
		}	
		System.out.println();
		
	}//line end
}
