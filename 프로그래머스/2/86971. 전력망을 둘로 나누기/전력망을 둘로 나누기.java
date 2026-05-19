import java.util.*;

class Solution {
    private List<Integer>[] adj;
    private boolean[] visited;

    public int solution(int n, int[][] wires) {
        int answer = n;
        adj = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            adj[wire[0]].add(wire[1]);
            adj[wire[1]].add(wire[0]);
        }

        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            visited = new boolean[n + 1];
            
            int count = dfs(v1, v2);
            int diff = Math.abs(count - (n - count));
            
            answer = Math.min(answer, diff);
        }

        return answer;
    }

    private int dfs(int current, int blocked) {
        visited[current] = true;
        int count = 1;

        for (int next : adj[current]) {
            if (next != blocked && !visited[next]) {
                count += dfs(next, blocked);
            }
        }
        return count;
    }
}