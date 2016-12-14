package bg.alexander.algorithms.longestPalindromicString;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestLongestPalindromicString {
    @Test
    @Parameters({"babad,bab","cdbbd,bb"})
    public void testLongestPalindromicString(String given, String expected){
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();

        assertEquals(expected,longestPalindromicString.longestPalindrome(given));
    }

    @Test
    @Parameters({"a,false","bb,true","bab,true","abcba,true","vbd,false"})
    public void isPalindromic(String given, Boolean expected){
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();

        assertEquals(expected,longestPalindromicString.isPalindromicString(given));
    }
}
