package blind_75;

import java.util.*;

public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        if (strs.length == 1) {
            List<String> list = new ArrayList();
            list.add(strs[0]);
            result.add(list);
            return result;
        }
        Set<String> set = new HashSet();
        for (int i=0;i<strs.length;i++) {
            set.add(strs[i]);
        }

        for (int i=0;i<strs.length;i++) {
            if (set.contains(strs[i])) {
                List<String> list = new ArrayList();
                for (int j=i+1;j<strs.length;j++) {
                    if (isAnagram(strs[i], strs[j])) {
                        list.add(strs[j]);
                        set.remove(strs[j]);
                    }
                }
                list.add(strs[i]);
                result.add(list);
                set.remove(strs[i]);
            }
        }
        // System.out.println(result);
        return result;
    }

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
