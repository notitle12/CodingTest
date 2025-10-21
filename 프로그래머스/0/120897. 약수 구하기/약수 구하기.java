import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> num_list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                num_list.add(i);
            }
        }
        
        int[] answer = new int[num_list.size()];
        
        for(int i = 0; i < num_list.size(); i++) {
            answer[i] = num_list.get(i);
        }
        
        
        return answer;
    }
}