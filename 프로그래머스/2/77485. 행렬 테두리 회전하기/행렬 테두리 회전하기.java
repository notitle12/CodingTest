class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] matrix = new int[rows + 1][columns + 1];
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                matrix[i][j] = num++;
            }
        }

        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int x1 = queries[q][0];
            int y1 = queries[q][1];
            int x2 = queries[q][2];
            int y2 = queries[q][3];

            int temp = matrix[x1][y1];
            int min = temp;

            for (int i = x1; i < x2; i++) {
                matrix[i][y1] = matrix[i + 1][y1];
                min = Math.min(min, matrix[i][y1]);
            }

            for (int i = y1; i < y2; i++) {
                matrix[x2][i] = matrix[x2][i + 1];
                min = Math.min(min, matrix[x2][i]);
            }

            for (int i = x2; i > x1; i--) {
                matrix[i][y2] = matrix[i - 1][y2];
                min = Math.min(min, matrix[i][y2]);
            }

            for (int i = y2; i > y1 + 1; i--) {
                matrix[x1][i] = matrix[x1][i - 1];
                min = Math.min(min, matrix[x1][i]);
            }

            matrix[x1][y1 + 1] = temp;
            answer[q] = min;
        }

        return answer;
    }
}