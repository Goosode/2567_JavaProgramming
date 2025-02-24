import java.io.*;
import java.util.*;

public class Lab1101 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		System.out.print("Input Section: ");
		int section = scanner.nextInt();
		
		printHeader(section);
		displayStudentList(section);
		
	}//Main end

	private static void printHeader(int section) {
		System.out.println("*****************************************************");
		System.out.println("\tList of Data for Section " + section);
		System.out.println("*****************************************************");
	}//printHeader end
	
	private static void displayStudentList(int section) throws IOException{
		try(BufferedReader reader = new BufferedReader(new FileReader("src//txtFile//List107.txt"))){
			String temp = "";
			while ((temp = reader.readLine()) != null) {
				String[] data = temp.split("\t");
				
				if(data.length < 6) continue; //skip data less than 6 data
				
				int stuSection = Integer.parseInt(data[3]); //Str to int
				
				if(stuSection == section) {
					float midterm = Float.parseFloat(data[4]);
					float finalExam = Float.parseFloat(data[5]);
					float totalScore = midterm + finalExam;
					
					System.out.printf("%s \t%s \t%.2f \t%s %n", data[0], data[2], totalScore, determineResult(totalScore));
				}
			}//while end
		}//try end
		
	}//displayStudentList end

	private static String determineResult(float totalScore) {
		return totalScore <= 40 ? "Fail" : "Pass";
	}//determineResult end
}
