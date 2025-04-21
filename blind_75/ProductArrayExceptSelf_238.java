package blind_75;

public class ProductArrayExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];
        prefixProd[0] = nums[0];
        suffixProd[nums.length-1] = nums[nums.length-1];

        for (int i=1;i<nums.length;i++) {
            prefixProd[i] = prefixProd[i-1]*nums[i];
        }
        for (int i=nums.length-2;i>=0;i--) {
            suffixProd[i] = suffixProd[i+1]*nums[i];
        }
        for (int i=0;i<nums.length;i++) {
            int prod = 1;
            if (i>0) {
                prod = prod * prefixProd[i-1];
            }
            if (i<nums.length-1) {
                prod = prod * suffixProd[i+1];
            }
            nums[i] = prod;
        }
        return nums;
    }
}
