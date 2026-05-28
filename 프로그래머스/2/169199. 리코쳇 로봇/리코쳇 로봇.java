import java.util.*;

class Solution {
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        int[] start = new int[2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'R') {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, -1);

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);
        dist[start[0]][start[1]] = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            if (board[r].charAt(c) == 'G') return dist[r][c];

            for (int i = 0; i < 4; i++) {
                int nr = r;
                int nc = c;

                while (nr + dr[i] >= 0 && nr + dr[i] < n && nc + dc[i] >= 0 && nc + dc[i] < m && board[nr + dr[i]].charAt(nc + dc[i]) != 'D') {
                    nr += dr[i];
                    nc += dc[i];
                }

                if (dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }

        return -1;
    }
}