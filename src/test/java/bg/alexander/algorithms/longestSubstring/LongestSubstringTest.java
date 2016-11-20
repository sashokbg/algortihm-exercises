package bg.alexander.algorithms.longestSubstring;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class LongestSubstringTest {
    @Test
    @Parameters({",0","a,1","bb,1","abba,2","pwwkew,3","abcabcbb,3","dvdf,3","abcabcdd,4"})
    public void testLongestSubstring(String string, int expected){
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(longestSubstring.lengthOfLongestSubstring(string),expected);
    }

    @Test
    @Parameters({" ,false","a,false","abc,false","abca, true"})
    public void hasRepeatingChars(String string, boolean expected){
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(longestSubstring.hasRepetition(string),expected);
    }
}
