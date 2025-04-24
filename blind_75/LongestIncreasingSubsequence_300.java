package blind_75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence_300 {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int num : nums) {
            int idx = Collections.binarySearch(list, num);
            if (idx<0) {
                idx = -1*(idx+1);
            }
            if (idx == list.size()) {
                list.add(num);
            } else {
                list.set(idx, num);
            }

        }
        return list.size();
    }
}
