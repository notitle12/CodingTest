import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                nums.add(i);
            }
        }
        
        for(int j = 0; j < nums.size(); j++) {
            str.add(todo_list[nums.get(j)]);
        }

        String[] answer = str.toArray(String[]::new);
        
        return answer;
    }
}