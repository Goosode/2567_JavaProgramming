import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float[] score = new float[5];
		
		float average = 0;
		int indexDisplay = 0;

		for(int i = 0; i < score.length; i++) {
			System.out.print("Input score of student " + (i + 1) + " : ");
			score[i] = scanner.nextFloat();
			
			average += score[i]; //sum 
		}
		
		average /= score.length; //find average
		
		System.out.printf("\nAverage of %s student is %.2f%n", score.length, average);
		
		for (float _score : score) {
			indexDisplay++;
			
			//find student who score high than average		
			if(average < _score) {
				System.out.printf("> Student %s (%.2f)%n", indexDisplay, _score);
			}
		}
		
		scanner.close();
	}//main end

}
