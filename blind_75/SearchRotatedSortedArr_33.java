package blind_75;

public class SearchRotatedSortedArr_33 {
    public int search(int[] nums, int target) {
        int pivot = findMin(nums);

        int left = binarySearch(nums, 0, pivot-1, target);

        if (left < 0) {
            int right = binarySearch(nums, pivot, nums.length-1, target);
            System.out.println(right);
            if (right < 0) {
                return -1;
            } else {
                return right;
            }
        } else {
            return left;
        }

    }

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
                result = mid;
                break;
            }
        }
        return result;
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        int result = -1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (nums[mid] > target) {
                end = mid-1;
            } else if (nums[mid] < target) {
                start = mid+1;
            } else {
                result = mid;
                break;
            }
        }
        return result;
    }
}
