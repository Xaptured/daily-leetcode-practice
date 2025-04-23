package blind_75;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        int size = list.size();
        int d = 0;

        int n = matrix.length;
        int m = matrix[0].length;
        int depthController = m/2;
        while (d<=depthController) {
            int previousSize = size;
            for (int i=d;i<m-d;i++) {
                list.add(matrix[d][i]);
            }
            int currentSize = list.size();
            if (!isSizeChanged(previousSize, currentSize)) break;
            for (int i=d+1;i<n-d;i++) {
                list.add(matrix[i][m-d-1]);
            }
            previousSize = currentSize;
            currentSize = list.size();
            if (!isSizeChanged(previousSize, currentSize)) break;
            for (int i=m-d-2;i>=d;i--) {
                list.add(matrix[n-d-1][i]);
            }
            previousSize = currentSize;
            currentSize = list.size();
            if (!isSizeChanged(previousSize, currentSize)) break;
            for (int i=n-d-2;i>=d+1;i--) {
                list.add(matrix[i][d]);
            }
            previousSize = currentSize;
            currentSize = list.size();
            if (!isSizeChanged(previousSize, currentSize)) break;
            d++;
            size = currentSize;
        }
        return list;
    }

    private boolean isSizeChanged(int previousSize, int currentSize) {
        if (currentSize > previousSize) {
            return true;
        } else {
            return false;
        }
    }
}
