import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] ch_before = before.toCharArray();
        char[] ch_after = after.toCharArray();
        
        Arrays.sort(ch_before);
        Arrays.sort(ch_after);
        
        boolean equal = Arrays.equals(ch_before, ch_after);
        int answer = equal ? 1 : 0;
        
        return answer;
    }
}