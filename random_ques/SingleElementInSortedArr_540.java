package random_ques;

public class SingleElementInSortedArr_540 {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length ==1) return nums[0];
        int start = 0;
        int end = nums.length-1;
        while (start<end) {
            int mid = (start+end)/2;

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid-1]) {
                    end = mid-2;
                }else if (nums[mid] == nums[mid+1]) {
                    start = mid+2;
                } else {
                    return nums[mid];
                }
            } else {
                if (nums[mid] == nums[mid-1]) {
                    start = mid+1;
                } else if (nums[mid] == nums[mid+1]) {
                    end = mid-1;
                } else {
                    return nums[mid];
                }
            }
        }
        return nums[start];
    }
}
