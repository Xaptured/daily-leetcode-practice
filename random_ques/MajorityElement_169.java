package random_ques;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet().stream().sorted((e1,e2) -> e2.getValue().intValue()-e1.getValue().intValue())
                .limit(1).map(e -> e.getKey()).toList().get(0);
    }
}
