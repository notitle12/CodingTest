import java.util.*;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int currentDigit = storey % 10;
            int nextDigit = (storey / 10) % 10;
            
            if (currentDigit > 5) {
                answer += (10 - currentDigit);
                storey += 10;
            } else if (currentDigit == 5) {
                if (nextDigit >= 5) {
                    answer += 5;
                    storey += 10;
                } else {
                    answer += 5;
                }
            } else {
                answer += currentDigit;
            }
            
            storey /= 10;
        }
        
        return answer;
    }
}