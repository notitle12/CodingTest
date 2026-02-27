import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(friends[i], i);
        }

        int[][] record = new int[n][n];
        int[] giftScore = new int[n];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = indexMap.get(parts[0]);
            int taker = indexMap.get(parts[1]);

            record[giver][taker]++;
            giftScore[giver]++;
            giftScore[taker]--;
        }

        int maxGifts = 0;
        for (int i = 0; i < n; i++) {
            int currentPredict = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (record[i][j] > record[j][i]) {
                    currentPredict++;
                } else if (record[i][j] == record[j][i]) {
                    if (giftScore[i] > giftScore[j]) {
                        currentPredict++;
                    }
                }
            }
            maxGifts = Math.max(maxGifts, currentPredict);
        }

        return maxGifts;
    }
}