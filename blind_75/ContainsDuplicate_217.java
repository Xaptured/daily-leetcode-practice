package blind_75;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n->n, Collectors.counting()));
        for (Map.Entry<Integer,Long> entry : map.entrySet()) {
            if (entry.getValue() > 1) return true;
        }
        return false;
    }
}
