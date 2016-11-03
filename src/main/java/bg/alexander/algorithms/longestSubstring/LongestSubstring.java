package bg.alexander.algorithms.longestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
//        int result = longestSubstring.lengthOfLongestSubstring("abba"); //2
        int result = longestSubstring.lengthOfLongestSubstring("abcabcbb"); //3
//        int result = longestSubstring.lengthOfLongestSubstring("bb"); //1
//        int result = longestSubstring.lengthOfLongestSubstring("pwwkew"); //3
//      int result = longestSubstring.lengthOfLongestSubstring("abcabcdbb"); //4
//      int result = longestSubstring.lengthOfLongestSubstring("dvdf"); //3

        System.out.println(result);
    }

    public int lengthOfLongestSubstring(String s) {
        return substring(s);
    }

    public int substring(String string){
        int nextSubstrLen = 0;

        Set<Character> uniqueCharacters = new HashSet<>();

        for (int i= 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            uniqueCharacters.add(currentChar);

            for (int j = i+1; j< string.length(); j++) {
                char nextChar = string.charAt(j);
                if(uniqueCharacters.contains(nextChar)){
                    nextSubstrLen = substring(string.substring(1));
                    return Math.max(nextSubstrLen, uniqueCharacters.size());
                }else{
                    uniqueCharacters.add(nextChar);
                }
            }
        }

        return uniqueCharacters.size();
    }
}
