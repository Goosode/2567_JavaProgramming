
//================================= Example2 ================================= 
import java.util.*;
public class BookDemo {
	public static void main(String[] args) {
		//Obj
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();

		//Input author details
		System.out.print("Input author name   : ");
		String authorName = scanner.nextLine();
		System.out.print("Input author e-mail : ");
		String authorEmail = scanner.next();
		scanner.nextLine();
		
		Author author1 = new Author(authorName, authorEmail);
		System.out.println();
		
		//Input book details
		System.out.print("Input book title : ");
		String bookTitle = scanner.nextLine();
		System.out.print("Input book page : ");
		int bookPage = scanner.nextInt();
		
		Book book1 = new Book(bookTitle, author1, bookPage);
		System.out.println(book1);
		
		scanner.close();
	}
}
