package random_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> list = Arrays.asList(1);
            return list;
        }

        if (rowIndex == 1) {
            List<Integer> list = Arrays.asList(1,1);
            return list;
        }
        List<Integer> list2 = Arrays.asList(1,1);
        List<Integer> memoList = list2;

        for (int i=2;i<=rowIndex;i++) {
            List<Integer> list = new ArrayList(i+1);
            for (int j=0;j<=i;j++) {
                if (j==0) list.add(1);
                else if (j==i) list.add(1);
                else list.add(memoList.get(j-1) + memoList.get(j));
                System.out.println("j: " + j);
            }
            memoList = list;
        }
        return memoList;
    }
}
