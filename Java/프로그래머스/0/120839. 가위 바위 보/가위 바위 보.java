import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] ch = rsp.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if (ch[i] == '2') {
                ch[i] = '0';
            } else if (ch[i] == '0') {
                ch[i] = '5';
            } else if (ch[i] == '5') {
                ch[i] = '2';
            }
        }
        return new String(ch);
    }
        
}