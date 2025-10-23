import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[num_list.length];
        
        for(int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        
        for(int j = 0; j < n; j++) {
            list.add(num_list[j]);
        }
        
        for(int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}