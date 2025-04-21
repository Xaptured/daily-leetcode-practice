package blind_75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] result = {-1, -1};
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }
        for (int i=0;i<nums.length;i++) {
            int find = target-nums[i];
            if (map.containsKey(find) && i!=map.get(find)) {
                result[0] = i;
                result[1] = map.get(find);
                break;
            }
        }
        return result;
    }
}
