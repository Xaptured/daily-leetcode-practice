package blind_75;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes_73 {
    public void setZeroes(int[][] matrix) {
        List<Point> list = new ArrayList<>();

        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                if (matrix[i][j] == 0) {
                    Point point = new Point(i, j);
                    list.add(point);
                }
            }
        }

        for (Point point : list) {
            int x = point.getxIndex();
            int y = point.getyIndex();

            for (int i=0;i<matrix.length;i++) {
                matrix[i][y] = 0;
            }

            for (int i=0;i<matrix[x].length;i++) {
                matrix[x][i] = 0;
            }
        }

    }

    public class Point{
        private int xIndex;
        private int yIndex;

        public Point(int xIndex, int yIndex) {
            this.xIndex = xIndex;
            this.yIndex = yIndex;
        }

        public int getxIndex() {
            return xIndex;
        }

        public int getyIndex() {
            return yIndex;
        }

        public void setxIndex(int xIndex) {
            this.xIndex = xIndex;
        }

        public void setyIndex(int yIndex) {
            this.yIndex = yIndex;
        }
    }
}
