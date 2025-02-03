
//================================= Example1 ================================= 
public class Student {
	//attribute
	private String studentName;
	private int studentScore;
	
	//method
	public void setName(String stdName) {
		studentName = stdName;
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	
	public int getScore() {
		return studentScore;
	}
	
	public boolean checkScore() {
		return getScore() >= 0 && getScore() <= 100;
	}
	
	public boolean isPass() {
		return getScore() >= 50;
	}
}
