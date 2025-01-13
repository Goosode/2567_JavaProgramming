import java.util.*;

public class Lab502 {
    public static void main(String[] args) {
        //scanner obj
        Scanner scanner = new Scanner(System.in);

        //array var
        int[] num = new int[5];

        //loop use for input array value
        for(int i = 0; i < num.length; i++){
            System.out.print("Input number " + (i + 1) + " : ");
            num[i] = scanner.nextInt();

            //if input is'n Positive number
            while (true) {
                if(num[i] < 0){
                    System.out.print("Input number, again " + (i + 1) + " : ");
                    num[i] = scanner.nextInt();
                }
                else{
                    break;
                }
            }
            
        }

        //display
        System.out.println("\nSummation of positive number is " + SumOfPos(num));
        
        scanner.close();
    }//Main end

    public static int SumOfPos(int[] num) {
        int sum = 0;

        for (int _num : num) {
            sum += _num;
        }

        return sum;
    }//SumOfPos end
}