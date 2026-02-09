import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
                continue;
            }
            for (int winNum : win_nums) {
                if (num == winNum) {
                    matchCount++;
                    break;
                }
            }
        }

        int maxRank = getRank(matchCount + zeroCount);
        int minRank = getRank(matchCount);

        return new int[]{maxRank, minRank};
    }

    private int getRank(int count) {
        switch (count) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}