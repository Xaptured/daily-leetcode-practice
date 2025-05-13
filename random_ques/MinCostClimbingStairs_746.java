package random_ques;

import java.util.Arrays;

public class MinCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int pick = minCost(cost, 0, dp);
        int notPick = minCost(cost, 1, dp);
        return Math.min(pick, notPick);
    }

    public int minCost(int[] cost, int idx, int[] dp) {
        if (idx >= cost.length) return 0;
        if (dp[idx] != -1) return dp[idx];
        int onePick = cost[idx] + minCost(cost, idx+1, dp);
        int twoPick = cost[idx] + minCost(cost, idx+2, dp);
        dp[idx] = Math.min(onePick, twoPick);
        return dp[idx];
    }
}
