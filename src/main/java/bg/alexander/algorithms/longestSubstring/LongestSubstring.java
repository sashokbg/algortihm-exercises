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
        longestSubstring.lengthOfLongestSubstring("abcabcbb");
    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        if(s.length()==0){
            return 0;
        }

        for (int i= 1; i < s.length(); i++) {
            char currentChar = chars[i];
            for (int j = 0; j < i; j++) {
                char previousChar = chars[j];
                if (currentChar == previousChar) {
                    System.out.println(s.substring(0,i));
                    break;
                }
            }
        }

        return 0;
    }
}
