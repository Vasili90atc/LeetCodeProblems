package gt.atc.training.LeetCodeProblems;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SolutionTest {

	
	@Test
    public void testLengthOfLastWord1()
    {
		Solution s = new Solution();
        assertTrue( s.lengthOfLastWord("Hello World") == 5 );
    }
	
	@Test
    public void testLengthOfLastWord2()
    {
		Solution s = new Solution();
        assertTrue( s.lengthOfLastWord("   fly me   to   the moon  ") == 4 );
    }
	
	@Test
    public void testLengthOfLastWord3()
    {
		Solution s = new Solution();
        assertTrue( s.lengthOfLastWord("luffy is still joyboy") == 6 );
    }
}
