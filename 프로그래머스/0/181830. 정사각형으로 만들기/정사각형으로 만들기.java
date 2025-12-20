class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int size = Math.max(rows, cols);

        int[][] answer = new int[size][size];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, cols);
        }

        return answer;
    }
}