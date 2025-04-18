package blind_75;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
    public boolean isAnagram(String original, String matcher) {
        if (original.length() != matcher.length()) return false;
        else {
            Map<Character, Integer> map = new HashMap();

            for (char c : original.toCharArray()) {
                if (map.containsKey(c)) {
                    int val = map.get(c);
                    val++;
                    map.put(c, val);
                } else {
                    map.put(c, 1);
                }
            }

            for (char c : matcher.toCharArray()) {
                if (map.containsKey(c)) {
                    int val = map.get(c);
                    val--;
                    map.put(c, val);
                } else {
                    return false;
                }
            }

            for(Integer i : map.values()) {
                if (i>0) {
                    return false;
                }
            }
            return true;
        }
    }
}
