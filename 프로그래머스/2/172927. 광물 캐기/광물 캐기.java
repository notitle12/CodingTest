import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int totalPicks = Arrays.stream(picks).sum();
        int maxCount = Math.min(minerals.length, totalPicks * 5);
        
        List<int[]> groups = new ArrayList<>();
        
        for (int i = 0; i < maxCount; i += 5) {
            int dia = 0, iron = 0, stone = 0;
            for (int j = i; j < Math.min(i + 5, maxCount); j++) {
                if (minerals[j].equals("diamond")) dia++;
                else if (minerals[j].equals("iron")) iron++;
                else stone++;
            }
            groups.add(new int[]{dia, iron, stone});
        }
        
        Collections.sort(groups, (a, b) -> {
            if (b[0] != a[0]) return b[0] - a[0];
            if (b[1] != a[1]) return b[1] - a[1];
            return b[2] - a[2];
        });
        
        int[][] fatigue = {
            {1, 1, 1},
            {5, 1, 1},
            {25, 5, 1}
        };
        
        int pickIdx = 0;
        for (int[] group : groups) {
            while (pickIdx < 3 && picks[pickIdx] == 0) {
                pickIdx++;
            }
            if (pickIdx == 3) break;
            
            answer += group[0] * fatigue[pickIdx][0];
            answer += group[1] * fatigue[pickIdx][1];
            answer += group[2] * fatigue[pickIdx][2];
            
            picks[pickIdx]--;
        }
        
        return answer;
    }
}