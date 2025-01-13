import java.util.*;

public class Lab503 {
    public static void main(String[] args) {
        //scanner obj
        Scanner scanner = new Scanner(System.in);

        //array
        int[] num = new int[7];

        //variable
        int count = 0;
        String oddText = "";

        //loop for input
        for(int i = 0; i < num.length; i++){
            System.out.print("Input number " + (i + 1) + " : ");
            num[i] = scanner.nextInt();
        }

        //loop for output
        for (int _num : num) {
            if( _num % 2 != 0){
                count++; //use for count odd number
                oddText += (_num + " "); //oddText get array value
            }
        }

        //display
        System.out.println("\nThere are " + count + " of odd number.");
        System.out.print("List of odd number : " + oddText);

        scanner.close();
    }
}