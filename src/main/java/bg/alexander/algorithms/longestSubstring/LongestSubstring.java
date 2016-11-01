package bg.alexander.algorithms.longestSubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:*
 * Given "abcabcbb", the answer is "abc", which the length is 3.*
 * Given "bbbbb", the answer is "b", with the length of 1.*
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * */
public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        int result = longestSubstring.lengthOfLongestSubstring("pwwkew");
//      int result = longestSubstring.lengthOfLongestSubstring("abcabcdbb");
//      int result = longestSubstring.lengthOfLongestSubstring("dvdf");

        System.out.println(result);
    }

    public int lengthOfLongestSubstring(String s) {
        return substring(s);
    }

    public int substring(String string){
        int substrlen = 0;
        int nextSubstrLen = 0;
        for (int i= 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            for (int j = 0; j < i; j++) {
                char previousChar = string.charAt(j);
                if (currentChar == previousChar) {
                    nextSubstrLen = substring(string.substring(1));
                    return nextSubstrLen > substrlen ? nextSubstrLen : substrlen;
                }
            }
            substrlen++;
        }

        return substrlen;
    }
}
