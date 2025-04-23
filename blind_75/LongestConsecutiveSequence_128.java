package blind_75;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        int maxLength = 0;
        for(int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            int point = num;
            int leftLength = 1;
            while (set.contains(--point)) {
                set.remove(point);
                leftLength++;
            }
            point = num;
            int rightLength = leftLength;
            while (set.contains(++point)) {
                set.remove(point);
                rightLength++;
            }
            maxLength = Math.max(maxLength, rightLength);
        }
        return maxLength;
    }
}
