package blind_75;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements_347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n->n, Collectors.counting()));
        List<Map.Entry<Integer, Long>> list = map.entrySet().stream().sorted((e1, e2) -> e2.getValue().intValue()-e1.getValue().intValue()).limit(k).toList();
        return list.stream().map(e -> e.getKey()).mapToInt(Integer::intValue).toArray();
    }
}
