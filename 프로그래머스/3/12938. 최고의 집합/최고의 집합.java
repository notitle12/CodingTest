import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        }

        int[] answer = new int[n];
        int quotient = s / n;
        int remainder = s % n;

        for (int i = 0; i < n; i++) {
            answer[i] = quotient;
        }

        for (int i = 0; i < remainder; i++) {
            answer[n - 1 - i]++;
        }

        return answer;
    }
}