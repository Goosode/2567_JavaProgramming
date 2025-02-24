package Example1;
//================================= Example1 ================================= 
import java.util.*;

public class TestStudent {
	public static void main(String[] args) {
		//obj
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many students in classroom: ");
		int numberOfStudent = scanner.nextInt();
		scanner.nextLine(); //IMPORTANT 

		//Arr Obj
		Student[] students = new Student[numberOfStudent];
		
		//forloop array
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT " + (i + 1));
			System.out.println("-----------------------------------------------");
			
			//user input
			System.out.print("Input student name  : ");
			students[i].setName(scanner.nextLine());
			
			System.out.print("Input student score : ");
			students[i].setScore(scanner.nextInt());
			scanner.nextLine();
			
			while (!students[i].checkScore()) {
				System.out.print("Input student score, again: ");
				students[i].setScore(scanner.nextInt());
				scanner.nextLine();
			}
		}//for end
		
		//output
		System.out.println("\nLIST OF PASS STUDENT (>= 50)");
		System.out.println("-----------------------------------------------");
		for(Student _student : students){
			if (_student.isPass()) {
				System.out.println(">> " + _student.getName() 
									+ " (" + _student.getScore() + ") "
									+ "get grade " + findGrade(_student.getScore()));
			}
		}
		
		scanner.close();
	}//Main end
	
	private static String findGrade(int score) {
		if(score <= 100 && score >= 80) {
			return "A";
		}
		else if(score <= 79 && score >= 75) {
			return "B+";
		}
		else if(score <= 74 && score >= 70) {
			return "B";
		}
		else if(score <= 69 && score >= 65) {
			return "C+";
		}
		else if(score <= 64 && score >= 60) {
			return "C";
		}
		else if(score <= 59 && score >= 55) {
			return "D+";
		}
		else if(score <= 54 && score >= 50) {
			return "D";
		}
		else {
			return "F";
		}
	}//findGrade end

}
