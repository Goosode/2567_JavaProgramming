import java.time.Year;
import java.util.*;

public class Lab102 {

	public static void main(String[] args) {
		//input
		Scanner  scan = new Scanner(System.in);
		
		//Input time
		System.out.print("Input the number of minutes : ");
		int minute = scan.nextInt();
		int day = minute / 24;
		int year = day / 365;
		
		//calculate
		System.out.print(minute + "minutes is approximately "+ year + "years and" + day + "days");
		
		
	}

}
