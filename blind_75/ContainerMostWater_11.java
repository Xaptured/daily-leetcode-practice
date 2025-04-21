package blind_75;

public class ContainerMostWater_11 {
    public int maxArea(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        int maxResult = 0;
        while (start<end) {
            int width = end-start;
            int height = Math.min(nums[start], nums[end]);
            int result = width*height;
            maxResult = Math.max(maxResult, result);
            if (nums[start] < nums[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxResult;
    }
}
