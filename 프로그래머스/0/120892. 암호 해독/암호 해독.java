import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        char[] ch = cipher.toCharArray();
        int len = cipher.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = code - 1; i < len; i += code) {
            sb.append(ch[i]);
        }
        
        return sb.toString();
    }
}