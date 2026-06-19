import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<int[]> moveList;

    public int[][] solution(int n) {
        moveList = new ArrayList<>();
        dfs(n, 1, 3, 2);
        
        int[][] answer = new int[moveList.size()][2];
        for (int i = 0; i < moveList.size(); i++) {
            answer[i] = moveList.get(i);
        }
        
        return answer;
    }

    private void dfs(int n, int from, int to, int via) {
        if (n == 1) {
            moveList.add(new int[]{from, to});
            return;
        }

        dfs(n - 1, from, via, to);
        moveList.add(new int[]{from, to});
        dfs(n - 1, via, to, from);
    }
}