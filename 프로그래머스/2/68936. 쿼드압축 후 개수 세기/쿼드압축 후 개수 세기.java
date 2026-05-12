class Solution {
    private int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        divide(arr, 0, 0, arr.length);
        return answer;
    }

    private void divide(int[][] arr, int r, int c, int size) {
        if (check(arr, r, c, size)) {
            answer[arr[r][c]]++;
            return;
        }

        int newSize = size / 2;
        divide(arr, r, c, newSize);
        divide(arr, r, c + newSize, newSize);
        divide(arr, r + newSize, c, newSize);
        divide(arr, r + newSize, c + newSize, newSize);
    }

    private boolean check(int[][] arr, int r, int c, int size) {
        int val = arr[r][c];
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (arr[i][j] != val) return false;
            }
        }
        return true;
    }
}