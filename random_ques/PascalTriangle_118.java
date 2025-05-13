package random_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            List<Integer> list = Arrays.asList(1);
            List<List<Integer>> result = new ArrayList();
            result.add(list);
            return result;
        }

        if (numRows == 2) {
            List<Integer> list1 = Arrays.asList(1);
            List<Integer> list2 = Arrays.asList(1,1);
            List<List<Integer>> result = new ArrayList();
            result.add(list1);result.add(list2);
            return result;
        }
        List<List<Integer>> result = new ArrayList();
        List<Integer> list1 = Arrays.asList(1);
        List<Integer> list2 = Arrays.asList(1,1);
        result.add(list1);result.add(list2);
        List<Integer> memoList = new ArrayList();
        memoList.add(1);memoList.add(1);

        for (int i=3;i<=numRows;i++) {
            List<Integer> list = new ArrayList(i);
            for (int j=0;j<i;j++) {
                if (j==0) list.add(1);
                else if (j==i-1) list.add(1);
                else list.add(memoList.get(j-1) + memoList.get(j));
            }
            memoList = list;
            result.add(list);
        }
        return result;
    }
}
