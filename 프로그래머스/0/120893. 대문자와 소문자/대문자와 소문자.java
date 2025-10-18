import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isLowerCase(ch[i])) {
                sb.append(Character.toUpperCase(ch[i]));
            } else {
                sb.append(Character.toLowerCase(ch[i]));
            }
        } 
        return sb.toString();
    }
}