class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int pass = 0;
            for (int j = 0; j < 7; j++) {
                int dayOfWeek = ((startday - 1 + j) % 7) + 1;
                if (dayOfWeek == 6 || dayOfWeek == 7) continue;

                int hope = schedules[i];
                int hour = hope / 100;
                int min = hope % 100;
                min += 10;
                if (min >= 60) {
                    hour += 1;
                    min -= 60;
                }
                int limit = hour * 100 + min;

                if (timelogs[i][j] <= limit) {
                    pass++;
                }
            }
            if (pass == 5) answer++;
        }
        return answer;
    }
}
