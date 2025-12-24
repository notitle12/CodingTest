class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            answer[i] = 1;
            int myScore = score[i][0] + score[i][1];

            for (int[] s : score) {
                int otherScore = s[0] + s[1];
                if (otherScore > myScore) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}