class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int minLevel = 1;
        int maxLevel = 1;
        for (int diff : diffs) {
            if (diff > maxLevel) {
                maxLevel = diff;
            }
        }

        int answer = maxLevel;

        while (minLevel <= maxLevel) {
            int midLevel = minLevel + (maxLevel - minLevel) / 2;

            if (isPossible(diffs, times, limit, midLevel)) {
                answer = midLevel;
                maxLevel = midLevel - 1;
            } else {
                minLevel = midLevel + 1;
            }
        }

        return answer;
    }

    private boolean isPossible(int[] diffs, int[] times, long limit, int level) {
        long totalTime = 0;

        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int timeCur = times[i];

            if (diff <= level) {
                totalTime += timeCur;
            } else {
                int timePrev = times[i - 1];
                long mistakes = diff - level;
                totalTime += mistakes * (timeCur + timePrev) + timeCur;
            }

            if (totalTime > limit) {
                return false;
            }
        }

        return true;
    }
}