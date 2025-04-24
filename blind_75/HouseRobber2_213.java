package blind_75;

import java.util.Arrays;

public class HouseRobber2_213 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] firstPart = new int[nums.length-1];
        int[] secondPart = new int[nums.length-1];
        int[] dp1 = new int[firstPart.length];
        Arrays.fill(dp1, -1);
        int[] dp2 = new int[secondPart.length];
        Arrays.fill(dp2, -1);
        for (int i=0;i<nums.length-1;i++) {
            firstPart[i] = nums[i];
        }
        for (int i=1;i<nums.length;i++) {
            secondPart[i-1] = nums[i];
        }
        int firstMax = getMaxMoney(0, firstPart, dp1);
        int secondMax = getMaxMoney(0, secondPart, dp2);
        return Math.max(firstMax, secondMax);
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
