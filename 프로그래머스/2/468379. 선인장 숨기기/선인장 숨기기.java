import java.util.*;

class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int[][] timeGrid = new int[m][n];
        int INF = drops.length + 1;
        for (int i = 0; i < m; i++) Arrays.fill(timeGrid[i], INF);

        for (int i = 0; i < drops.length; i++) {
            timeGrid[drops[i][0]][drops[i][1]] = i + 1;
        }

        int[][] rowMin = new int[m][n - w + 1];
        for (int i = 0; i < m; i++) {
            Deque<Integer> deque = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                while (!deque.isEmpty() && timeGrid[i][deque.peekLast()] >= timeGrid[i][j]) {
                    deque.removeLast();
                }
                deque.addLast(j);
                if (deque.peekFirst() <= j - w) deque.removeFirst();
                if (j >= w - 1) rowMin[i][j - w + 1] = timeGrid[i][deque.peekFirst()];
            }
        }

        int maxTime = -1;
        int resR = 0, resC = 0;

        for (int j = 0; j < n - w + 1; j++) {
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < m; i++) {
                while (!deque.isEmpty() && rowMin[deque.peekLast()][j] >= rowMin[i][j]) {
                    deque.removeLast();
                }
                deque.addLast(i);
                if (deque.peekFirst() <= i - h) deque.removeFirst();
                
                if (i >= h - 1) {
                    int currentTime = rowMin[deque.peekFirst()][j];
                    int r = i - h + 1;
                    int c = j;
                    
                    if (currentTime > maxTime) {
                        maxTime = currentTime;
                        resR = r;
                        resC = c;
                    } else if (currentTime == maxTime) {
                        if (r < resR || (r == resR && c < resC)) {
                            resR = r;
                            resC = c;
                        }
                    }
                }
            }
        }

        return new int[]{resR, resC};
    }
}