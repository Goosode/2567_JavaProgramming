import javax.swing.*;

public class JavaExample2 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		// Input product unit
		String productUitString = JOptionPane.showInputDialog("Input Product Unit : ");
		int productUnit = Integer.parseInt(productUitString);

		// Input price per unit
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input price per unit"));
		
		double totalprice = productPrice * productUnit;
		
		//Format output
		String frmTOtalPriceString = String.format("%,.2f", totalprice);
		
		//Add vat
		String frmVAT = String.format("%,.2f", totalprice + (totalprice * 7/100));
		
		//Display results by dialog box
		JOptionPane.showMessageDialog(null, "Total Price is " + frmTOtalPriceString + " baht."
									+ "\nAdd VAT 7% is " + frmVAT + " baht.");
		syste
	}
}
