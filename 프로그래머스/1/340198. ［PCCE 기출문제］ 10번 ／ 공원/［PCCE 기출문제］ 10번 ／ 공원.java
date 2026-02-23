import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int h = park.length;
        int w = park[0].length;

        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];

            for (int r = 0; r <= h - size; r++) {
                for (int c = 0; c <= w - size; c++) {
                    if (canPlace(park, r, c, size)) {
                        return size;
                    }
                }
            }
        }

        return -1;
    }

    private boolean canPlace(String[][] park, int row, int col, int size) {
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}