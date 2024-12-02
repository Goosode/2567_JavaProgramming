import javax.swing.JOptionPane;

public class Lab105 {
    public static void main(String[] args){
        //------------------------------- Declare and initialize variables And Get Input -------------------------------
        //ID
        String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order"
                                                + "\nPlease enter the ID of the CD");

        //Title
        String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
        
        //price
        float cdPrice = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));

        //quantity
        int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
    
        //------------------------------- Calculate -------------------------------
        //sub total
        float cdSubtotal = cdPrice * cdQuantity;

        //tax
        final float TAX_RATE = 6.25f;
        float cdTotal = cdSubtotal + (cdSubtotal * (TAX_RATE/100));

        //------------------------------- Display -------------------------------
        JOptionPane.showMessageDialog(null, "Summary of the transaction:"
                                    + "\n"
                                    + "\nCD ID: " + cdId
                                    + "\nCD Title: " + cdTitle
                                    + "\nCD Unit Price" + cdPrice
                                    + "\n CD Quantity: " + cdQuantity
                                    + "\n"
                                    + "\nSubtotal: $" + cdSubtotal
                                    + "\nTax rate: " + TAX_RATE + "%"
                                    + "\nTotal: $" + cdTotal
                                    + "\n"
                                    + "\nEnd of Program");

    }
}