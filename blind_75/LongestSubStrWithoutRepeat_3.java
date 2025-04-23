package blind_75;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStrWithoutRepeat_3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i=0;i<s.length();i++) {
            Set<Character> set = new HashSet();
            int currentMax = 0;
            for (int j=i;j<s.length();j++) {
                if (set.contains(s.charAt(j))) {

                    break;
                } else {
                    set.add(s.charAt(j));
                    currentMax++;
                }
            }
            maxLength = Math.max(currentMax, maxLength);
        }
        return maxLength;
    }
}
