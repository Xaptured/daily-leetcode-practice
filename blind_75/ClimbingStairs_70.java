package blind_75;

import java.util.Arrays;

public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        int[] dp = new int[46];
        Arrays.fill(dp, 0);
        return findSteps(n, dp);
    }

    public int findSteps (int n, int[] dp) {
        if (n==1) return 1;
        if (n==2) return 2;
        if (dp[n]>0) return dp[n];
        int ans = findSteps(n-1, dp) + findSteps(n-2, dp);
        dp[n] = ans;
        return ans;
    }
}
