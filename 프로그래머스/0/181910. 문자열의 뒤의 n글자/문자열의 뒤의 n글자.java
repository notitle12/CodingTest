import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        int end = my_string.length();
        int start = end - n;
        String answer = my_string.substring(start, end);
        return answer;
    }
}