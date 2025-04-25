package blind_75;

public class LongestPalindromicSubStr_5 {
    public String longestPalindrome(String s) {
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        int end  = 0;
        for (int i=0;i<s.length();i++) {
            int oddLength = lengthOfPalindrome(s, i, i);
            int evenLength = lengthOfPalindrome(s, i, i+1);
            System.out.println(oddLength + " - " + evenLength);
            int max = Math.max(oddLength, evenLength);
            if (maxLength < max) {
                maxLength = max;
                start = i - (maxLength-1)/2;
                end = i + maxLength/2;
            }
        }
        return s.substring(start, end+1);
    }

    private int lengthOfPalindrome (String s, int left, int right) {
        while (left>= 0 && right <s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
