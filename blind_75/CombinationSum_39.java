package blind_75;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        Stack<Integer> stack = new Stack();
        createCombinationSum(result, stack, candidates, 0, target);
        return result;
    }

    private void createCombinationSum(List<List<Integer>> result,Stack<Integer> stack, int[] candidates, int index, int target) {
        if (target < 0 ) {
            return;
        }
        if (target == 0) {
            List<Integer> list = new ArrayList(stack);
            result.add(list);
            return;
        }
        stack.push(candidates[index]);
        target = target-candidates[index];
        createCombinationSum(result, stack, candidates, index, target);

        stack.pop();
        if (index + 1 >= candidates.length) return;
        target = target+candidates[index];
        createCombinationSum(result, stack, candidates, index+1, target);
    }
}
