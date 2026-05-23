import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                if (c == 'S') start = new int[]{i, j};
                else if (c == 'L') lever = new int[]{i, j};
                else if (c == 'E') exit = new int[]{i, j};
            }
        }

        int toLever = bfs(maps, start, 'L');
        if (toLever == -1) return -1;

        int toExit = bfs(maps, lever, 'E');
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    private int bfs(String[] maps, int[] start, char target) {
        int n = maps.length;
        int m = maps[0].length();
        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, -1);
        Queue<int[]> q = new LinkedList<>();

        q.add(start);
        dist[start[0]][start[1]] = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            if (maps[curr[0]].charAt(curr[1]) == target) return dist[curr[0]][curr[1]];

            for (int i = 0; i < 4; i++) {
                int nr = curr[0] + dr[i];
                int nc = curr[1] + dc[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && maps[nr].charAt(nc) != 'X' && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[curr[0]][curr[1]] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return -1;
    }
}