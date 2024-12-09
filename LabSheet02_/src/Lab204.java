import java.util.*;

public class Lab204 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Input X Y
		System.out.print("Input value of X : ");
		int num1 = scanner.nextInt();

		System.out.print("Input value of Y : ");
		int num2 = scanner.nextInt();

		int addNum1 = num1;
		int tempNum1 = num1;
		int answer;

		boolean oneTimeCode = true;// use this code one time

		while(true) {

			//do this when input y less than x
			if(num2 <= num1) {
				System.out.print("Input value of Y, again : ");
				num2 = scanner.nextInt();

				continue;
			}
			//use for empty space
			if(oneTimeCode){
				System.out.println();
				oneTimeCode = false;
			}

			//when addnum1 = num2 program stop 
			if(addNum1 != num2){
				//num1 + 1
				addNum1++;
				//calculate
				answer = tempNum1 + addNum1;

				System.out.println(tempNum1 + " + " + addNum1 + " = " + answer);	
				tempNum1 = answer;		
			}
			else{
				break;
			}
		}

		scanner.close();
	}

}
