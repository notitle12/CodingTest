import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        String[] answer = new String[len];
        for(int i = 0; i < len; i++) {
            if(i % 2 == 1) {
                answer[i] = strArr[i].toUpperCase();
            } else {
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }
}