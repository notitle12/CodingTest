import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        int[] stack = new int[n];
        int top = -1;

        Arrays.fill(answer, -1);

        for (int i = 0; i < n; i++) {
            while (top != -1 && numbers[stack[top]] < numbers[i]) {
                answer[stack[top--]] = numbers[i];
            }
            stack[++top] = i;
        }

        return answer;
    }
}