import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = (num_list.length - 1) / n + 1;
        int[] answer = new int[length];
        int j = 0;
        
        for(int i = 0; i < num_list.length; i += n) {
            answer[j] = num_list[i];
            j++;
        }
        
        return answer;
    }
}