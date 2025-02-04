package gr.atc.training.LeetCodeProblems;


import java.util.Stack;

public class Solution {
	
	public int lengthOfLastWord(String s) {
		String[] parts = s.split(" ");

		/*
		 * for(String p : parts) { System.out.println(p + ", length:" + p.length()); if
		 * (p.length() > 0) { // this is a word
		 * 
		 * } 
		 * }
		 */
		String lastWord = parts[parts.length - 1];
		System.out.println("Explanation: The last word is " + lastWord + " with length " + lastWord.length() + ".");
		return lastWord.length();
	}

	public int titleToNumber(String columnTitle) {
		// A = 1
		// B = 2
		// C = 3
		// ...
		// Z = 26
		// AA = 1*26 + 1
		// ...
		// AZ = 52
		// BA = 2*26 + 1
		// ...
		// ZZ = 26*26 + 26
		// AAA = 1*26^2 + 1*26^1 + 1*26^0
		if (columnTitle.length() <= 1 || columnTitle.length() >= 7) {
			return -1;
		}
		for (char c : columnTitle.toCharArray()) {
			if (!Character.isUpperCase(c))
				return -1;
		}

		int num = 0;
		int exponent = columnTitle.length() - 1;
		for (char c : columnTitle.toCharArray()) {
			num += (c - 'A' + 1) * Math.pow(26, exponent);
			exponent--;
		}
		return num;
	}
	
	
	public int searchInsert(int[] nums, int target) {
		// If number exists
		for(int i=0; i<nums.length; i++) {
			// If number does not exist in list
			if (nums[i] >= target) {
				return i;
			
			}
		 }
		
		
		//for (int i=0; i<nums.length; i++) {
		//	if (nums[i] >= target)
		//	return i;
		// }
		// Target is biggest in list
		
		return nums.length;
	}
	
	public boolean isValid(String s) {
		Stack<Character> symbolStack = new Stack<>();
		
		for(char symbol : s.toCharArray()) {
			//System.out.println(symbol);
			if (symbol == '(' || symbol == '{' || symbol == '[') {
				symbolStack.add(symbol);
			}
			if (symbol == ')' || symbol == '}' || symbol == ']') {
				if (symbolStack.peek() == '(' && symbol != ')') 
					return false;
				if (symbolStack.peek() == '{' && symbol != '}') 
					return false;
				if (symbolStack.peek() == '[' && symbol != ']') 
					return false;
				symbolStack.pop();
			}
		}
		
		if (symbolStack.size() > 0) 
			return false;
		
		return true;
	}

}