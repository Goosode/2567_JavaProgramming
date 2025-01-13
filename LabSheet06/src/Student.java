
public class Student {
	//attributes
	private String name;
	private float[] scores;
	
	//method
	//set detail
	public void SetStudentDetails(String stdName, float[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	//find average score
	public float CalculateAverageScore() {
		float average = 0;
		
		/*for (int i = 0; i < scores.length; i++) { 
			average += scores[i]; 
			}
		*/
		
		for(float _score : scores) {
			average += _score;
		}
		
		return average / scores.length;
	}
	
	//get grade based on average score
	public char GetGrade() {
		float grade = CalculateAverageScore();
		
		if(grade >= 80) {
			return 'A';
		}
		else if(grade >= 70 || grade <= 79){
			return 'B';
		}
		else if(grade >= 60 || grade <= 69){
			return 'C';
		}
		else if(grade >= 50 || grade <= 59){
			return 'D';
		}
		else{
			return 'F';
		}
	}
	
	//display details
	public void DisplayStudentDetails() {
		System.out.println("Name: " + name);
		/*
		for (int i = 0; i < scores.length; i++) { 
			System.out.print(scores[i] + " ");
		}
		 */
		
		for(float _score : scores) {
			System.out.print(_score + " ");
		}
			
		System.out.println("\nAverage Score: " + CalculateAverageScore());
		System.out.println("Grade: " + GetGrade());
		System.out.println();
	}
}
