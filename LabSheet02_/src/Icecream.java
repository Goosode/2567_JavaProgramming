import javax.swing.*;

public class Icecream {
    public static void main(String[] args) {
        //constant variable
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        //variable
        int totalPrice, iceFlavor, choose;
        String toppingText = "";

        //Input flavor
        iceFlavor = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Vanilla Flavor 10 B."
                                                                                    + "\n[2] Chocolate Flavor 15 B"
                                                                                    + "\nPress number to choose flavor:"));

        while (iceFlavor < 1 || iceFlavor > 2) {
            //Error message
            JOptionPane.showMessageDialog(null, "ERROR: Wrong choice! " + "\nTry again...", "ERROR", JOptionPane.ERROR_MESSAGE);

            //Input again
            iceFlavor = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Vanilla Flavor 10 B."
                                                                            + "\n[2] Chocolate Flavor 15 B"
                                                                            + "\nPress number to choose flavor:"));

        }    

        //add price to totalPrice
        totalPrice = iceFlavor == 1 ? VANILLA : CHOCOLATE;
        
        //Have topping?
        choose = JOptionPane.showConfirmDialog(null, "Do you want to add a topping?", "Topping", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                                      
        totalPrice += choose == 0 ? TOPPING : 0; //add topping price
        toppingText = choose == 0 ? "with topping" : "no topping"; //use for text

        JOptionPane.showMessageDialog(null, "You choose Chocolate Flavor"
                                                            + "\nAnd " + toppingText
                                                            + "\nTotal Price = " + totalPrice + " baht.");
    }
}
