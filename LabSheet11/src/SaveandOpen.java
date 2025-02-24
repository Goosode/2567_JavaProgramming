//==================================Example5==================================
import java.util.*;
import java.io.*;

public class SaveandOpen extends Employee{
	//Attribute
	private String name;
	private String dept;
	
	//Method
	public void insert() throws IOException{
		Scanner scanner = new Scanner(System.in);
		PrintStream write = new PrintStream(new File("src//txtFile//employee.txt"));
		
		String answer;
		do {
			super.header();
			System.out.print("Enter name : ");
			name = scanner.next();
			
			System.out.print("Enter department : ");
			dept = scanner.next();
			
			//save name,dept to file
			write.println(name + "\t" + dept);
			
			System.out.print("Enter data again? : ");
			answer = scanner.next();
			
		} while (answer.equalsIgnoreCase("y"));
	}//insert end
	
	public void read(){
		try {
			//Obj read
			Scanner read = new Scanner(new File("src//txtFile//employee.txt"));
			
			int i = 0;
			boolean check = false;
			
			super.header();
			
			while (read.hasNext()) {
				name = read.next();
				dept = read.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i + ") " + name);
					check = true;
				}//if end
			}//while end
			
			if (check) {
				super.header();
				System.out.println("Employee in dept " + super.getDept() + "is " + i + "person(s).");
				super.header();
			}
			else {
				System.out.print("\nSorry, no dept: " + super.getDept() + " in file");
			}//if end
		} 
		catch (IOException e) {
			System.out.print("\nSorry file not found...");
		}
	}//read end
}
