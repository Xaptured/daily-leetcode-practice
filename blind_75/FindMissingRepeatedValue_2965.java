package blind_75;

import java.util.HashMap;
import java.util.Map;

public class FindMissingRepeatedValue_2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> map = new HashMap();
        int length = grid.length;
        for (int i=0;i<length;i++) {
            for (int j=0;j<length;j++) {
                if (map.containsKey(grid[i][j])) {
                    int val = map.get(grid[i][j]);
                    val++;
                    map.put(grid[i][j], val);
                } else {
                    map.put(grid[i][j], 1);
                }
            }
        }
        int repeated = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                repeated = entry.getKey();
                break;
            }
        }
        int prod = length*length;
        int expectedSum = (prod * (2 + (prod-1)))/2;
        int actualSum = 0;

        for (Integer i : map.keySet()) {
            actualSum = actualSum + i;
        }
        int missing = expectedSum - actualSum;
        int[] result = {repeated, missing};
        return result;
    }
}
