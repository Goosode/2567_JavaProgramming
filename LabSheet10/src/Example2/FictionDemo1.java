package Example2;
//===============================================Example2============================================
import java.util.*;

public class FictionDemo1 {

	public static void main(String[] args) {
		//OBJ
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.print("Input Book title: ");
		String bookTitle = scanner.nextLine();
		
		System.out.print("Input Public year: ");
		int publicYear = scanner.nextInt();
		scanner.nextLine();
		
		//OBJ
		FictionBook fBook = new FictionBook(bookTitle, publicYear);
		//===============================================
		
		System.out.print("Input Name: ");
		String authorName = scanner.nextLine();
		
		System.out.print("Inpue Email: ");
		String authorEmail = scanner.nextLine();
		
		fBook.setAuthorName(authorName);
		fBook.setEmail(authorEmail);
		
		while(!fBook.checkEmail()) {
			System.out.print("Inpue Email, again: ");
			authorEmail = scanner.nextLine();
			fBook.setEmail(authorEmail);
		}
		System.out.println();
		System.out.println(fBook);
		
		scanner.close();
	}

}
