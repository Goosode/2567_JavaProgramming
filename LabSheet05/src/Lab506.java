import javax.swing.*;

public class Lab506 {
    public static void main(String[] args) {
        //array
        String[] greetWord = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};

        //variable
        String greetText = "";

        //loop
        for (String word : greetWord) {
            greetText += "\n- " + word; //greetText get array value
        }

        //display
        JOptionPane.showMessageDialog(null, "The greeting words ine English:" + greetText);
    }
}