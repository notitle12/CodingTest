import java.util.*;

class Solution {
    public int solution(String num_str) {
        char[] ch = num_str.toCharArray();
        int sum = 0;
        
        for(int i = 0; i < num_str.length(); i++) {
            sum += ch[i] - '0';
        }
        
        return sum;
    }
}