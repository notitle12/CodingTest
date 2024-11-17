class Solution {
    public int[] solution(int money) {
        int americano = 5500;
        int[] answer = {0,1};
        answer[0] = money / americano;
        answer[1] = money % americano;
        return answer;
    }
}