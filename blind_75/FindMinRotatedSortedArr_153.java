package blind_75;

public class FindMinRotatedSortedArr_153 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int result = -1;
        while (start<=end) {
            int mid = (end+start)/2;
            if (nums[mid] > nums[end]) {
                start = mid+1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                result = nums[mid];
                break;
            }
        }
        return result;
    }
}
