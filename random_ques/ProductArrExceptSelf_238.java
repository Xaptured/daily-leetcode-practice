package random_ques;

public class ProductArrExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i=1;i<nums.length;i++) {
            prefix[i] = prefix[i-1] * nums[i];
        }

        suffix[nums.length-1] = nums[nums.length-1];
        for (int i=nums.length-2;i>=0;i--) {
            suffix[i] = suffix[i+1] * nums[i];
        }

        for (int i=0;i<nums.length;i++) {
            int prod = 1;
            if (i-1>=0) {
                prod = prod * prefix[i-1];
            }
            if (i+1 <=nums.length-1) {
                prod = prod * suffix[i+1];
            }
            nums[i] = prod;
        }
        return nums;
    }
}
