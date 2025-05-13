package random_ques;

import java.util.Arrays;

public class NthTribonacciNumber_1137 {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return tri(n, dp);
    }

    public int tri(int n, int[] dp) {
        if (n==0) return 0;if (n==1) return 1;if (n==2) return 1;
        if (dp[n] != -1) return dp[n];
        dp[n] = tri(n-1, dp) + tri(n-2, dp) + tri(n-3, dp);
        return dp[n];
    }
}
