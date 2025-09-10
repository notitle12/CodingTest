class Solution {
    public int solution(int hp) {
        int answer = 0;
        int warlord = 0;
        int soldier = 0;
        int worker = 0;
        
        warlord = hp / 5;
        soldier = (hp % 5) / 3;
        worker = (hp % 5) % 3;
        
        answer = warlord + soldier + worker;
        
        return answer;
    }
}