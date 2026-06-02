import java.util.*;

class Solution {
    private int[] dx = {-1, 1, 0, 0};
    private int[] dy = {0, 0, -1, 1};
    private boolean[][] visited;
    private int rows, cols;

    public int[] solution(String[] maps) {
        rows = maps.length;
        cols = maps[0].length();
        visited = new boolean[rows][cols];
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    answerList.add(bfs(maps, i, j));
                }
            }
        }

        if (answerList.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(answerList);
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int bfs(String[] maps, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        
        int totalSum = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            totalSum += maps[x].charAt(y) - '0';

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                    if (maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        return totalSum;
    }
}