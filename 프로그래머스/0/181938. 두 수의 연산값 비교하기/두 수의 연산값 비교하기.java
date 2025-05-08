class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = String.valueOf(a) + String.valueOf(b);
        int answer1 = Integer.valueOf(str);
        if(answer1 >= 2 * a * b) {
            answer = answer1;
        } else {
            answer = 2 * a * b;
        }
        return answer;
    }
}