package gt.atc.training.LeetCodeProblems;

public class Solution {

	 public int lengthOfLastWord(String s) {
		String[] parts = s.split(" ");
		
		/*
	    for(String p : parts) {
	    	System.out.println(p + ", length:" + p.length());
	    	if (p.length() > 0) {
	    		// this is a word
	    		
	    	}
	    }
	    */
		String lastWord = parts[parts.length - 1];
		System.out.println("Explanation: The last word is " + lastWord + " with length " + lastWord.length() + ".");
	    return lastWord.length();
	 }
}
