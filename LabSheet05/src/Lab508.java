import javax.swing.*;
public class Lab508 {
	public static void main(String[] args) {		
		//array
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		
		//index of array input
		int indexOfArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array:"));

		//variable use for display
		String curr = "";
		String prev = "";
		String next = "";
		
		//if can't find index input new once
		while(true){
			if(!CheckIndex(nums, indexOfArray)){ //if false input again
				indexOfArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array, again:"));
			}
			else{
				break;
			}
		}
		
		//for easy to look
		curr = "Current data, nums[" + CurrentData(nums, indexOfArray) + "] is " + nums[CurrentData(nums, indexOfArray)];

		//short if use for set text in string variable
		prev = (PrevData(nums, indexOfArray) < 0) ? "\nNo previous data" : "\nPrevious data, nums[" + PrevData(nums, indexOfArray) + "] is " + nums[PrevData(nums, indexOfArray)];
		next = (NextData(nums, indexOfArray) >= nums.length) ? "\nNo next data" : "\nNext data, nums[" + NextData(nums, indexOfArray) + "] is " + nums[NextData(nums, indexOfArray)];
		
		//display output
		JOptionPane.showMessageDialog(null, curr + prev + next);

	}//Main end
	
	//================================================= CheckIndex =================================================
	public static boolean CheckIndex(int[] nums, int index) {	
		boolean check = false;
		
		for (int _nums : nums) {
			//if array equal input return false
			check = (_nums == index) ? check = true : check;
		}
		
		return check;
	}//CheckIndex end
	
	//================================================= CurrentData =================================================
	public static int CurrentData(int[] nums, int index){
		int currentIndex = 0;
		
		for (int i = 0; i < nums.length; i++) {
			currentIndex = (nums[i] == index) ? currentIndex = i : currentIndex;
		}
		
		return currentIndex;
	}//CurrentData end
	
	//================================================= PrevData =================================================
	public static int PrevData(int[] nums, int index) {
		int prevData = 0;
		
		for (int i = 0; i < nums.length; i++) {
			prevData = (nums[i] == index) ? prevData = i - 1: prevData;
		}
		
		return prevData;
	}//PrevData end
	
	//================================================= NextData =================================================
	public static int NextData(int[] nums, int index) {
		int nextData = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nextData = (nums[i] == index) ? nextData = i + 1: nextData;
		}
		
		return nextData;
	}//NextData end
}