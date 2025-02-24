//=========================================Lab4=========================================
import java.util.*;

public class ATMBanking {

	public static void main(String[] args) {
		//OBJ
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter account number	: ");
		String id = scanner.next();
		
		while (id != ) {
			System.out.print("Input wrong type, Enter account number	: ");
			id = scanner.next();
		}
		
		//============password============
		System.out.print("Enter passwrod	: ");
		String password = scanner.next();
		
		while (password.length() < 4 || password.length() > 4) {
			System.out.print("Enter passwrod	: ");
			password = scanner.next();
		}//while end
		
		//============money============
		System.out.print("Enter money	: ");
		int money = scanner.nextInt();
		
		while (money % 100 != 0 || money < 0) {
			System.out.print("Enter money	: ");
			money = scanner.nextInt();
		}//while end
		
		
		//OBJ
		ATMChecking bank = new ATMChecking(id, password, money);
		
		bank.show();
	}

}
