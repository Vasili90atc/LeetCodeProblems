package gr.atc.training.LeetCodeProblems;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SolutionTest {
	
	@Test
    public void testLengthOfLastWord()
    {
		Solution s = new Solution();
        assertTrue( s.lengthOfLastWord("Hello World") == 5 );
        assertTrue( s.lengthOfLastWord("   fly me   to   the moon  ") == 4 );
        assertTrue( s.lengthOfLastWord("luffy is still joyboy") == 6 );
    }
	
	@Test
    public void testTitleToNumber()
    {
		Solution s = new Solution();
        assertTrue( s.titleToNumber("A") == 1 );
        assertTrue( s.titleToNumber("AB") == 28 );
        assertTrue( s.titleToNumber("ZY") == 701 );
    }
	
	@Test
    public void testSearchInsert()
    {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		int target = 5;
        assertTrue( s.searchInsert(nums,target) == 2);
    }
	
	@Test
    public void testIsValid()
    {
		Solution s = new Solution();
        assertTrue( s.isValid("()") == true);
        assertTrue( s.isValid("()[]{}") == true);
        assertTrue( s.isValid("(]") == false);
    }
}
