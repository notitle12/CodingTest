import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        String alpUpper = alp.toUpperCase();
        String answer = my_string.replaceAll(alp, alpUpper);
        return answer;
    }
}