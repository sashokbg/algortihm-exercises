package bg.alexander.algorithms.longestPalindromicString;

public class LongestPalindromicString {
    public String longestPalindrome(String s) {
        int window_size = 2;
        int window_position = 0;

        String palindromicString = null;
        int i = 0;
        while (window_position + window_size < s.length()) {
            palindromicString = s.substring(window_position, window_size);
            if(isPalindromicString(palindromicString)){
                //move the window
                window_position++;
                window_size++;
            }
            else{
                //increse window size
                window_size++;
            }
            i++;
        }
        return palindromicString;
    }

    public boolean isPalindromicString(String string){
        if(string.length() < 2){
            return false;
        }

        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString().equals(string);
    }
}
