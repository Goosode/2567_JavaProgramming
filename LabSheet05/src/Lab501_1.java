import javax.swing.*;

public class Lab501_1 {
	
	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptWasFound = false;
		
		String inputDept = JOptionPane.showInputDialog("Enter a department name");
		
		//Check input is in list
		for(int i = 0; i < deptName.length; i++) {
			if(inputDept.equals(deptName[i])) {
				deptWasFound = true;
			}
		}
		
		//Check dept was found or not
		if(deptWasFound) {
			JOptionPane.showMessageDialog(null, inputDept + " was found in the list");
		}
		else {
			JOptionPane.showMessageDialog(null, inputDept + " was not found in the list");
		}
		
	}
}
