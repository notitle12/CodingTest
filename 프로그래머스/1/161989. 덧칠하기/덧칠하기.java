class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int currentEnd = 0;

        for (int point : section) {
            if (point > currentEnd) {
                answer++;
                currentEnd = point + m - 1;
            }
        }

        return answer;
    }
}