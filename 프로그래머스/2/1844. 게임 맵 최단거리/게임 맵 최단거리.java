import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        maps[0][0] = 0; 
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int dist = current[2];
            
            if (r == n - 1 && c == m - 1) return dist;
            
            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && maps[nr][nc] == 1) {
                    maps[nr][nc] = 0;
                    queue.add(new int[]{nr, nc, dist + 1});
                }
            }
        }
        
        return -1;
    }
}
