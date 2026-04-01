import java.util.*;

class Solution {
    private int n;
    private int[][] costs;
    private int[][] hintInfo;
    private Map<String, Long> memo;

    public long solution(int[][] cost, int[][] hint) {
        this.n = cost.length;
        this.costs = cost;
        this.hintInfo = hint;
        this.memo = new HashMap<>();

        return dp(0, new int[n + 1]);
    }

    private long dp(int idx, int[] h) {
        if (idx == n) return 0;

        StringBuilder sb = new StringBuilder();
        sb.append(idx);
        for (int i = idx + 1; i <= n; i++) {
            if (h[i] > 0) sb.append(',').append(i).append(':').append(h[i]);
        }
        String key = sb.toString();

        if (memo.containsKey(key)) return memo.get(key);

        long min = Long.MAX_VALUE / 2;
        int can = Math.min(h[idx + 1], n - 1);

        for (int u = 0; u <= can; u++) {
            long base = costs[idx][u];
            
            int[] next = new int[n + 1];
            for (int i = idx + 2; i <= n; i++) next[i] = h[i];

            min = Math.min(min, base + dp(idx + 1, next));

            if (idx < n - 1) {
                int[] nextB = next.clone();
                long p = hintInfo[idx][0];
                for (int i = 1; i < hintInfo[idx].length; i++) {
                    nextB[hintInfo[idx][i]]++;
                }
                min = Math.min(min, base + p + dp(idx + 1, nextB));
            }
        }

        memo.put(key, min);
        return min;
    }
}