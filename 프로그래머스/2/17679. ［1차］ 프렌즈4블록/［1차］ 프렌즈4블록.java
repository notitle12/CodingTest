import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            grid[i] = board[i].toCharArray();
        }

        int totalRemoved = 0;
        while (true) {
            boolean[][] isRemoved = new boolean[m][n];
            boolean found = false;

            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char block = grid[i][j];
                    if (block != '-' && block == grid[i][j + 1] && 
                        block == grid[i + 1][j] && block == grid[i + 1][j + 1]) {
                        isRemoved[i][j] = isRemoved[i][j + 1] = 
                        isRemoved[i + 1][j] = isRemoved[i + 1][j + 1] = true;
                        found = true;
                    }
                }
            }

            if (!found) break;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isRemoved[i][j]) {
                        grid[i][j] = '-';
                        totalRemoved++;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (grid[i][j] == '-') {
                        for (int k = i - 1; k >= 0; k--) {
                            if (grid[k][j] != '-') {
                                grid[i][j] = grid[k][j];
                                grid[k][j] = '-';
                                break;
                            }
                        }
                    }
                }
            }
        }

        return totalRemoved;
    }
}