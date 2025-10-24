import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        int len = 0;
        List<String> answer = new ArrayList<>();
            
        if(names.length % 5 == 0) {
            len = names.length / 5;
        } else {
            len = names.length / 5 + 1;
        }
        
        for(int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }
        
        return answer.toArray(String[]::new);
    }
}