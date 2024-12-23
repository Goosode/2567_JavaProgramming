import javax.swing.*;

public class Lab508 {

	public static void main(String[] args) {
		//NOT FINISH
		
		//TODO
		//add loop when index of array when wrong input
		//fix bug
		
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		
		int indexOfArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array:"));
		
		JOptionPane.showMessageDialog(null, "Current data, nums[" + CurrentData(nums, indexOfArray) + "] is " + nums[CurrentData(nums, indexOfArray)]
				 						+ "\nPrevious data, nums[" + PrevData(nums, indexOfArray) + "] is " + nums[PrevData(nums, indexOfArray)]
				 						+ "\nNext data, nums[" + PrevData(nums, indexOfArray) + "] is " + nums[PrevData(nums, indexOfArray)]);
		
		CurrentData(nums, indexOfArray);
		PrevData(nums, indexOfArray);
		NextData(nums, indexOfArray);
		
	}//Main end
	
	public static boolean CheckIndex(int[] nums, int index) {	
		boolean check = false;
		
		for (int _nums : nums) {
			//if array equal input return false
			check = (_nums == index) ? check = true : check;
		}
		
		return check;
	}//CheckIndex end
	
	public static int CurrentData(int[] nums, int index){
		int currentIndex = 0;
		
		for (int i = 0; i < nums.length; i++) {
			currentIndex = (nums[i] == index) ? currentIndex = i : currentIndex;
		}
		
		return currentIndex;
	}//CurrentData end
	
	public static int PrevData(int[] nums, int index) {
		int prevData = 0;
		
		for (int i = 0; i < nums.length; i++) {
			prevData = (nums[i] == index) ? prevData = i - 1: prevData;
		}
		
		return prevData;
	}//PrevData end
	
	public static int NextData(int[] nums, int index) {
		int nextData = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nextData = (nums[i] == index) ? nextData = i + 1: nextData;
		}
		
		return nextData;
	}//NextData end
}
