import java.util.*;

public class Lab307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //use input
        System.out.print("Text: ");
        String text = scanner.nextLine().toLowerCase();

        //remove empty space 
        text = text.replaceAll(" ", "");

        int left = 0; //first index
        int right = text.length() - 1;//last index
        //use for check palindrome
        boolean isPalindrome = true;

        while (left < right) {
            //if left is not same alphabet right
            if(text.charAt(left) != text.charAt(right)){
                isPalindrome = false;
            }

            //check next alphabet
            left++;
            right--;
        }

        //display
        if(isPalindrome){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }

        scanner.close();
    }
}