package gr.atc.training.LeetCodeProblems;

public class App {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		// s.lengthOfLastWord("luffy is still joyboy");
		
		// System.out.println("AB number: " + s.titleToNumber("AB") );
		
		/*
		 * int[] nums = {1,3,5,6}; int target = 7; System.out.println("searchInsert: " +
		 * s.searchInsert(nums,target) );
		 */
		
		System.out.println("isValid: " + s.isValid("()"));
		System.out.println("isValid: " + s.isValid("{}"));
		System.out.println("isValid: " + s.isValid("[]"));
		System.out.println("isValid: " + s.isValid("(]"));
	}
}
