import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Character[] str = new Character[s.length()];
        for(int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }
        
        Arrays.sort(str, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(char c : str) {
            sb.append(c);
        }
        answer = sb.toString();

        return answer;
    }
}