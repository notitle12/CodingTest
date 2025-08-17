class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int c = 0;
        if (b < a) {
            c = a;
            a = b;
            b = c;
        }
        
        for(int i = a; i < b+1; i++) {
            answer += i;
        }
        return answer;
    }
}