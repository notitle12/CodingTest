class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 1;
        for(int i = 0; i < n; i++) {
            answer[i] = x * sum;
            sum += 1;
        }
        return answer;
    }
}