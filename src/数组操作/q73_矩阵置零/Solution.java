package 数组操作.q73_矩阵置零;

/**
 * 用每行和每列的第一个元素作为标记，空间复杂度是o(1)，时间复杂度 o(m*n)
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> columns = new ArrayList<Integer>();

        for(int i = 0;i<matrix.length;i++) {
            for(int j = 0;j<matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(Integer row : rows) {
            for(int i = 0;i<matrix[row].length;i++) {
                matrix[row][i] = 0;
            }
        }

        for(Integer column : columns) {
            for(int i = 0;i<matrix.length;i++) {
                matrix[i][column] = 0;
            }
        }
    }
}
