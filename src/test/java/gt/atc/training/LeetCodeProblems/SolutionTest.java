package gt.atc.training.LeetCodeProblems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testLengthOfLastWord1() {
		Solution s = new Solution();
		assertTrue(s.lengthOfLastWord("Hello World") == 5);
	}

	@Test
	public void testLengthOfLastWord2() {
		Solution s = new Solution();
		assertTrue(s.lengthOfLastWord("   fly me   to   the moon  ") == 4);
	}

	@Test
	public void testLengthOfLastWord3() {
		Solution s = new Solution();
		assertTrue(s.lengthOfLastWord("luffy is still joyboy") == 6);
	}
	
	
	@Test
    public void testTitleToNumber1() {
		Solution s = new Solution();
        assertTrue( s.titleToNumber("A") == 1 );
    }
	
	@Test
    public void testTitleToNumber2() {
		Solution s = new Solution();
        assertTrue( s.titleToNumber("AB") == 28 );
    }
	
	@Test
    public void testTitleToNumber3() {
		Solution s = new Solution();
        assertTrue( s.titleToNumber("ZY") == 701 );
    }
	
	
	@Test
    public void searchInsert1()
    {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		int target = 5;
        assertTrue( s.searchInsert(nums,target) == 2);
    }
	
	@Test
    public void searchInsert2()
    {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		int target = 2;
        assertTrue( s.searchInsert(nums,target) == 1);
    }
	
	@Test
    public void searchInsert3()
    {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		int target = 7;
        assertTrue( s.searchInsert(nums,target) == 4);
    }
}