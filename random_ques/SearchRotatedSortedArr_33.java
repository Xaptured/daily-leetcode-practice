package random_ques;

public class SearchRotatedSortedArr_33 {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);
        int right = search(nums, pivot, nums.length-1, target);
        int left = search(nums, 0, pivot-1, target);
        System.out.println(right + " - " + left);
        return Math.max(right, left);

    }

    public int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            int mid = (start+end)/2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {

            }
        }
        return start;
    }

    public int search(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = (start+end)/2;
            if (nums[mid] > target) {
                end = mid-1;
            } else if (nums[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
