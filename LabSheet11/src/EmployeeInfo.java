//==================================Example5==================================
import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		//Obj
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insert or Read data? : ");
		String choose = scanner.next().toLowerCase();
		
		while(!choose.equals("insert") && !choose.equals("read")){
			System.out.print("Please text insert or read data? : ");
			choose = scanner.next().toLowerCase();
		}//while end

		//Obj
		SaveandOpen objFile = new SaveandOpen();
		
		if(choose.equals("insert")) {
			objFile.insert();
		}
		else {
			System.out.print("\nEnter dept : ");
			String dept = scanner.next();
			objFile.setDept(dept);
			objFile.read();
		}
	}

}
