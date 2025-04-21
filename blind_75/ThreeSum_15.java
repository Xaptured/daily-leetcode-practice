package blind_75;

import java.util.*;

public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start<end) {
                int total = nums[i] + nums[start] + nums[end];
                if (total < 0) {
                    start++;
                } else if (total > 0) {
                    end--;
                } else {
                    List<Integer> list = Arrays.asList(nums[i], nums[start], nums[end]);
                    set.add(list);
                    start++;
                    end--;
                }
            }
        }
        return new ArrayList(set);
    }
}
