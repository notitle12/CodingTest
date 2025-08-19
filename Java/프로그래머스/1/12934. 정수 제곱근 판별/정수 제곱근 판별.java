class Solution {
    public long solution(long n) {
        long answer = -1;
        long i = 0;
        while(i * i <= n) {
            if(i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            }
            i++;
        }
        return answer;
    }
}