package blind_75;

import java.util.Arrays;

public class HouseRobber_198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return getMaxMoney(0, nums, dp);
    }

    private int getMaxMoney(int index, int[] nums, int[] dp) {
        if (index >= nums.length) return 0;
        if (index == nums.length-1) return nums[nums.length-1];
        if (dp[index] != -1) return dp[index];
        int pick = nums[index] + getMaxMoney(index+2, nums, dp); // 4
        int notPick = getMaxMoney(index+1, nums, dp);
        dp[index] = Math.max(pick, notPick);
        return dp[index];
    }
}
