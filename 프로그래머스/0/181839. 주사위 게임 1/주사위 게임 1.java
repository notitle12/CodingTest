class Solution {
    public int solution(int a, int b) {
        int score = 0;
        if(a % 2 == 0 && b % 2 == 0) {
            if(a > b) {
               score = a - b;
            } else {
              score = b - a;  
            }
        } else if (a % 2 != 0 && b % 2 != 0) {
            score =  a * a + b * b;
        } else {
            score = 2 * (a + b);
        }
        return score;
    }
}