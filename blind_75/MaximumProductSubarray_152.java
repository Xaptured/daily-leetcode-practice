package blind_75;

public class MaximumProductSubarray_152 {
    public int maxProduct(int[] nums) {
        int product = 1;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            product = product * nums[i];
            max = Math.max(product, max);
            if (product == 0) product = 1;
        }
        product = 1;
        for (int i=nums.length-1;i>=0;i--) {
            product = product * nums[i];
            max = Math.max(product, max);
            if (product == 0) product = 1;
        }
        return max;
    }
}
