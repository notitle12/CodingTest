class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;
        int length = String.valueOf(n).length();
        for(int i = 0; i < length; i++ ) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}