import javax.swing.*;

public class Lab507 {
    public static void main(String[] args) {
        //array
        int[] num = new int[5];

        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number " + (i + 1) + " :"));
        }

        //Display
        ShowEven(num);
        ShowOdd(num);
    }//Main end

    public static void ShowEven(int[] nums){
        String even = "";

        for (int _nums : nums) { //loop
            if(_nums % 2 == 0){ //find even num
                even += _nums + " ";
            }
        }

        //even display
        JOptionPane.showMessageDialog(null, "List of even number:\n" + even);
    }//ShowEven end

    public static void ShowOdd(int[] nums){
        String odd = "";

        for (int _nums : nums) { //loop
            if(_nums % 2 != 0){ //find odd num
                odd += _nums + " ";
            }
        }

        //odd display
        JOptionPane.showMessageDialog(null, "List of odd number:\n" + odd);
    }//ShowOdd end
}