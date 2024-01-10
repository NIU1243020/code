public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1, 0, 2},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1}
        };

        int zeroRowCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            boolean isZeroRow = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    isZeroRow = false;
                    break;
                }
            }
            if (isZeroRow) {
                zeroRowCount++;
            }
        }

        System.out.println("有 " + zeroRowCount + " 列的資料列全為0。");
    }
}
