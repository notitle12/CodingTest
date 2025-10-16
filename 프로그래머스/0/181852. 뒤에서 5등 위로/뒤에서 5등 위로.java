import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int end = num_list.length;
        
        int[] answer = Arrays.copyOfRange(num_list, 5, end);
        return answer;
    }
}