import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String digits = my_string.replaceAll("\\D", "");
        
        char[] chars = digits.toCharArray();
        
        int[] answer = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            answer[i] = digits.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        return answer;
    }
}