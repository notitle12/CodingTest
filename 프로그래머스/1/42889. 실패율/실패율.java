import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> failureRates = new HashMap<>();
        int totalPlayers = stages.length;

        for (int i = 1; i <= N; i++) {
            int currentStage = i;
            long count = Arrays.stream(stages).filter(s -> s == currentStage).count();

            if (totalPlayers == 0) {
                failureRates.put(i, 0.0);
            } else {
                failureRates.put(i, (double) count / totalPlayers);
                totalPlayers -= count;
            }
        }

        return failureRates.entrySet().stream()
                .sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}