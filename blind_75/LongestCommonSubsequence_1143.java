package blind_75;

import java.util.Arrays;

public class LongestCommonSubsequence_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i=0;i<text1.length();i++)
            Arrays.fill(dp[i], -1);
        return commonLength(text1, text2, 0, 0, dp);
    }

    private int commonLength(String text1, String text2, int pointer1, int pointer2, int[][] dp) {
        if (pointer1 == text1.length() || pointer2 == text2.length()) return 0;
        if (dp[pointer1][pointer2] != -1) return dp[pointer1][pointer2];
        if (text1.charAt(pointer1) == text2.charAt(pointer2)) {
            dp[pointer1][pointer2] = 1+commonLength(text1, text2, pointer1+1, pointer2+1, dp);
            return dp[pointer1][pointer2];
        } else {
            int p1Inc = commonLength(text1, text2, pointer1+1, pointer2, dp);
            int p2Inc = commonLength(text1, text2, pointer1, pointer2+1, dp);
            dp[pointer1][pointer2] = Math.max(p1Inc, p2Inc);
            return dp[pointer1][pointer2];
        }
    }
}
