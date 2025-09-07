class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int i = 1;
        while (slice * i < n) {
            i++;
        }
        
        answer = i;
        return answer;
    }
}