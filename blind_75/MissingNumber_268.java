package blind_75;

public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int arraySum = 0;
        for(int i=0;i<=nums.length;i++)
            sum = sum + i;
        for(int i=0;i<nums.length;i++)
            arraySum = arraySum + nums[i];
        return sum-arraySum;
    }
}
