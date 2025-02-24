//=========================================Lab4=========================================
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class ATMChecking extends ATMData{
	//Attribute
	private int money;
	
	//Constructor
	public ATMChecking(String accountNumber, String password,int money) {
		super(accountNumber, password);
		this.money = money;
	}
	
	//Method
	public boolean checkBookBank() throws IOException{
		Scanner reader = new Scanner(new File("src//txtFile//ATMBookBank.txt"));
		
		while (reader.hasNext()) {
			String id = reader.next();
			String password = reader.next();
			int balance = reader.next();
			
		}
		return
	}
	
	public void show() throws IOException {
		if(!checkBookBank()) {
			System.out.println("Sorry, your ID or password is wrong, or your amount is not enough.");
			return;
		}
		
		int thousands = money / 1000;
		int fiveHundres = (money % 1000) / 500;
		int hundreds = (money % 500) / 100;
		
		System.out.printf("Your drawing for %,.2f, get:%n", money);
		System.out.printf("\t1000 = %0f%n", thousands);
		System.out.printf("\t500 = %0f%n", fiveHundres);
		System.out.printf("\t100 = %0f%n", hundreds);
		System.out.printf("Your balance is %,.2f Baht.%n", (balance - money));
	}
	
}
