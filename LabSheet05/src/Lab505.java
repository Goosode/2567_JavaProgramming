import java.util.*;

public class Lab505 {
    public static void main(String[] args) {
        //scanner obj
        Scanner scanner = new Scanner(System.in);

        //array
        int[] num = {78, 36, 58, 41, 25, 92, 75};

        //variable
        int index;
        String curr;
        String next;

        //input index
        System.out.print("Input index of array : ");
        index = scanner.nextInt();

        while (true) {
            if(index < 0 || index >= num.length){
                System.out.print("Input index of array, again : ");
                index = scanner.nextInt();
            }
            else{
                break;
            }
        }

        //use for make easy to look 
        curr = "\nValue is current index is " + num[index];
        next = (index + 1 >= num.length) ? "\nSorry, " + index + " is the last index in array." : "\nValue is next   index is " + num[index + 1];

        //Display
        System.out.println(curr + next);

        scanner.close();
    }
}