class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int count = 0;
        int range = number.length;
        for(int i = 0; i < range; i++) {
            for(int j = i+1; j < range; j++) {
                for(int k = j+1; k < range; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }
        
        answer = count;
        return answer;
    }
}